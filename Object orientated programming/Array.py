array = ["Andrew has jiggers\n","Peter has cancer\n"]
file = open("word.txt","w")
file.writelines(array)
file.close



'''
Python File object methods

FUNCTION	                        DESCRIPTION

<file.close()>	                    Close the file. You must reopen it for additional access.
<file.flush()>	                    Flush the internal buffer. It’s same as the <stdio>’s <fflush()> function.
<file.fileno()>	                    Returns the descriptor of an integer file.
<file.isatty()>	                    It returns true if file has a <tty> attached to it.
<file.next()>	                    Returns the next line from the last offset.
<file.read(size)>	                Reads the given no. of bytes. It may read less if EOF is hit.
<file.readline(size)>	            It’ll read an entire line from the file.
<file.readlines(size_hint)>	        It calls the <readline()> to read until EOF.
<file.seek(offset[, from])>	        Sets the file’s current position.
<file.tell()>	                    Returns the file’s current position.
<file.truncate(size)>	            Truncates the file’s size.
<file.write(string)>	            It writes a string to the file.
<file.writelines(sequence)>	        Writes a sequence of strings to the file.
'''