import time
from subprocess import Popen, PIPE
import argparse
parser = argparse.ArgumentParser()
parser.add_argument("--language",default="java")
parser.add_argument("code")
parser.add_argument('input_files',nargs='*')

args = parser.parse_args()
code = args.code
input_files = args.input_files
lang = args.language

if lang == "java":
	Popen(["javac",code])
	exe = code.split(".")[0]
	proc = Popen(["java",exe],stdin=PIPE)
	start_total = time.time()
	for ind,File in enumerate(input_files):	
		with open(File,"r") as f:
			start = time.time()
			proc.stdin.write(f.read())
			print "case "+str(ind+1),":", time.time() - start
	print "total run time: ", time.time() - start_total