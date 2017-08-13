# CustomFontTextView
Android project to customize your textviews.


How to use:

Copy the classes CustomTextView and FontLoader to your project.

Add an Assets folder to your project, and add a font (.ttf) file which you want to use.

In the class CustomTextView. Change the code (line 30): 
   Typeface customFont = FontLoader.getTypeface("<your_font.ttf>", context);
   

In your layout xml file:

include your new text view as  <Customization.CustomTextView... />


the TextView in the project uses a font called Sword Thrasher which is created by Jonathan Harris.
