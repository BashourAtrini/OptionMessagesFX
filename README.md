# OptionMessagesFX
Modern and Customizable option panes for javafx

Features:

  * Modern and flexible ui
  * Multifunctional
  * customizable for your needs
  * More to come
  
# Quick start

### Examples for Confirm Pane:

  #### Example 1:
```
    new ConfirmMessage("This is the Hearder", "The message content");
```
  #### Example 2:
```
    new ConfirmMessage("This is the Hearder", "The message content", "Button1 Text", "Button2 Text");
```
  #### Example 3:
```
    new ConfirmMessage("This is the Hearder", "The message content", "Button1 Text", "Button2 Text", "button1 color", "button2 color");
```
  #### Example 4:
```
    new ConfirmMessage("This is the Hearder", "The message content", "Button1 Text", "Button2 Text", "button1 color", "button2 color", "Buttons Text Color");
```
  #### Example 5:
```
    new ConfirmMessage("This is the Hearder", "The message content", "Button1 Text", "Button2 Text", "button1 color", "button2 color", "Buttons Text Color", "/path/to/the/icon.png");
```
  #### Example 6 :
```
    ConfirmMessage confirmMessage = new ConfirmMessage();
				
    confirmMessage.setHeaderText("This is the Hearder");
    confirmMessage.setMessageText("The message content");
    confirmMessage.setButton1Text("Button1 Text");
    confirmMessage.setButton2Text("Button2 Text");
    confirmMessage.setButton1Color("#767654");
    confirmMessage.setButton2Color("#234514"); 
    confirmMessage.setButtonTextFillColor("White");
    confirmMessage.setImageSource("/img/warning-circle.png");
    confirmMessage.setEnableBouncing(true);
				
    confirmMessage.showConfirm();
```

# Credits
using the [jfoenix](https://github.com/jfoenixadmin/JFoenix) and [AnimateFX](https://github.com/Typhon0/AnimateFX)

