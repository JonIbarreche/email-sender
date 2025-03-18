# EmailSender

A Java application for sending emails with attachments using JavaMail API.

## Overview

EmailSender is a simple yet powerful Java utility that allows you to send emails with attachments programmatically. It leverages the JavaMail API to establish secure SMTP connections and send emails through Gmail's SMTP server.

## Features

- Send emails to specified recipients
- Include subject and HTML formatted message body
- Attach files to your emails
- Secure authentication using SSL

## Requirements

- Java JDK 8 or higher
- Maven for dependency management

## Installation

1. Clone this repository:
   ```
   git clone https://github.com/yourusername/email-sender.git
   ```

2. Navigate to the project directory:
   ```
   cd email-sender
   ```

3. Build the project with Maven:
   ```
   mvn clean package
   ```

## Usage

1. Open `SendMailWithAttachment.java` and modify the following variables:
   - `to`: The recipient's email address
   - `from`: Your Gmail address
   - `password`: Your Gmail password or app password
   - Attachment file path as needed

2. Run the application:
   ```
   java -cp target/EnviarMail-0.0.1-SNAPSHOT.jar Sender
   ```

## Dependencies

The project uses the following dependencies:

```xml
<dependency>
  <groupId>javax.mail</groupId>
  <artifactId>mail</artifactId>
  <version>1.4.7</version>
</dependency>
```

## Security Note

It's recommended to use app-specific passwords instead of your main Google account password. You can generate one in your Google Account security settings.

## Contributing

Contributions are welcome! Feel free to submit a Pull Request.

## Contact

Jon Ibarreche - jon.ibarreche@opendeusto.es

## License

Copyright © 2021 Jon Ibarreche - All rights reserved


