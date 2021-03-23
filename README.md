Requirements
The starter code provides much of the code generated as part of the zyBooks chapter 6 tasks and activities. For your assignment to be considered complete you must do the following:

Documentation

Edit the README.md file with appropriate GitHub Markdown styles to summarize the changes made to the starter code. You should also include the names of any students that you collaborated with (collaboration is ok, but your code should be relatively distinct).
Include any *necessary* comments directly in .java files. Necessary comments include those needed to explain logic that may be unclear from context, or incomplete code. In general, I'm looking for you to spend more time making your code read cleanly, and less time with comments.
Note: Including more comments than are strictly necessary will not be penalized - you may use JavaDoc style documentation if you wish.
Note: I will however penalize completely unnecessary comments (such as comments that refer to code that has been deleted); commented out code that has no bearing on your final submission (i.e. unneeded test code, etc.); and poor formatting in general.

# MainActivity.java

Add an AppBar menu that uses an 'add' button to open an item entry dialog to add new list entries (see zyBooks section 4.5).

Add logic to handle presenting item entry dialog (see zyBooks section 5.3).

Add touch gestures logic to clear the To-Do List with a long press (see zyBooks sections 5.5 and 5.6).

Remove all unnecessary code (i.e. former add button + edit text and clear button components that are no longer necessary).

# Add Item fragment

You'll need to add a new .java file to your project to host the dialog fragment (see zyBooks section 5.3). This dialog should provide the ability for the user to enter text to add an item to the To-Do List (see zyBooks section 7.4).

# Drawables

Add an appropriate drawable for the AppBar menu (typically a '+' symbol for 'add' actions).

# activity_main.xml

The only thing our activity_main.xml file will need is a TextView. Remove all unnecessary buttons, and the ScrollView (note that we would probably prefer to keep the ScrollView in place, but it interferes with the TouchGesture control, since a long press on a ScrollView is used to initiate a scroll action. If we wanted to include both types of behaviour - scrolling through the list and a long press to clear - then we would be better off using a RecyclerView - but we're not quite there yet).

And, in general, please be careful to choose appropriate naming conventions for all identifiers (i.e. variables, methods, etc.). Make sure your code is well-formatted before submission (no unnecessary whitespace, good indenting and spacing). And, of course, make sure it runs without errors!