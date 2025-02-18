# Mobile App Automation with Appium

## 📌 Project Overview ##

In this project, I have demonstrated how to automate interactions within an Android mobile app using **Appium**.  
The automation script is designed to automate a simple login flow in the **WDIO Demo App** (a sample app provided by Appium), where the test enters email and password into the respective fields and clicks the login button.

The primary goal is to demonstrate how Appium can interact with mobile elements like text boxes and buttons, and perform automation in an Android environment.

## 🚀 Technologies Used ##

#### - Java (Programming Language)
Java is used as the programming language for writing automation scripts.

#### - Appium (Mobile Automation Framework)
Appium is the core automation tool used to automate interactions with the mobile app.

#### - Android Emulator/Device (Test Environment)
Testing is done on an Android emulator (or a physical device) with the app installed.

#### - Maven (Dependency Management)
Maven is used for managing project dependencies, such as the Appium client and other required libraries.

#### - XPath (Element Locator Strategy)
XPath is used to locate elements within the mobile app’s UI for interaction.

## 📋 Setup Instructions ##

To run the tests, follow these steps:

1. **Install Java**: Ensure you have Java 17 or later installed on your system. You can check the version with:
   ```bash
   java -version
    ```

2. **Install Appium**: Install Appium: Install Appium globally by running the following command in the terminal:
   ```bash
   npm install -g appium
    ```
   
3. **Install Appium Java Client**: Install Appium: Install Appium globally by running the following command in the terminal:
    ```bash
   
    <dependency>
      <groupId>io.appium</groupId>
      <artifactId>java-client</artifactId>
      <version>8.0.0</version>
    </dependency>
     ```
4. **Start Appium Server**: In a terminal, run:
   ```bash
   appium
    ```

5. **Configure Emulator/Device**: Ensure that you have an Android emulator running or a physical Android device connected. You can use Android Studio’s AVD Manager to start an emulator.


6. **Run the Tests**: Execute the SetValues.java class in your IDE or terminal to launch the app and interact with the login fields. Make sure the Appium server is running before executing the tests.


## 🌱 Future Enhancements ##

- **Expand Automation Flow**:  
  Add more tests to automate other features of the app, such as adding products to the cart or navigating between different pages.

- **Error Handling**:  
  Improve error handling by adding assertions and better logging to track the execution flow.

- **CI/CD Integration**:  
  Integrate the tests into a CI/CD pipeline, such as Jenkins or GitLab CI, to run the tests automatically on each code change.

- **Cross-Device Testing**:  
  Extend the testing framework to support testing across different Android devices and versions.


## 📣 Feedback and Contributions ##

Feel free to open issues or submit pull requests for bug fixes, improvements, or new features. Contributions are welcome!
