#What is this project?
qBay is a eBay clone but for the use of Quinnipiac students. Students have accounts where they can log into the application, purchase up for sale items, and list their own items for sale.

## How to run this project?
You can run this project by running the Run.java which contains the main method. From there the program will prompt you how to interact with it.
Note: The hardcoded accounts are:
Username: Nick Password: night1
Username: Dawit Password: computer2
Username: Jeremy Password: science1

## Application Architecture
Run.java handles the logicistical flow for the application. Where it handles logging in and prompts the users for various interactions they can make with qBay.
Item.java is used to create Item objects that have a name, category, price, and seller for the item. It includes various methods useful for Item objects, such as printing it out a certain way.
User.java is used to create User objects which are the accounts that can sign into the app. A user has name, email, username, password, cart, and items they are selling. There are various methods to print out user's information and to handle adding and removing from the cart/items they are selling.
