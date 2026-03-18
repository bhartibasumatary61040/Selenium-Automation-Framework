
# Selenium Automation Framework (POM + TestNG + Maven)
  description: >
    A structured Selenium Automation Framework developed using
    Java, TestNG, and Maven following the Page Object Model (POM)
    design pattern. This framework is designed for scalability,
    reusability, and maintainability for web application testing.

# Objective
  To implement a robust automation framework using
  Selenium WebDriver with proper separation of test logic
  and page logic using Page Object Model.

technology_stack:
  programming_language: Java
  automation_tool: Selenium WebDriver
  testing_framework: TestNG
  build_tool: Maven
  design_pattern: Page Object Model (POM)
  dependency_management: Maven
  version_control: Git
  repository_hosting: GitHub

# Framework Architecture

  design_pattern:
    - Page Object Model (POM)
    - Abstract Component Reusability

  core_concepts:
    - Encapsulation of WebElements
    - Reusable Methods
    - Inheritance (AbstractComponent)
    - TestNG Execution
    - Maven Dependency Management

project_structure:

  SeleniumFrameworkDesign1:

    techbodhipractice:

      pageobjects:
        description: >
          Contains all Page Object classes.
          Each class represents one web page and
          contains WebElements and page methods.

        classes:
          - LandingPage.java
          - ProductCatalogue.java
          - CartPage.java
          - CheckoutPage.java
          - ConfirmationPage.java

      AbstractComponents:
        description: >
          Contains reusable components like
          wait methods, common navigation,
          and shared functionality.

        classes:
          - AbstractComponent.java

    test/java/techbodhipractice:
      description: >
        Contains Test Classes written using TestNG.

      classes:
        - StandAloneTest.java
        - SubmitOrderTest.java

    pom.xml:
      description: >
        Maven configuration file managing dependencies
        such as Selenium, TestNG, and WebDriverManager.

features:

  - Page Object Model implementation
  - Abstract reusable components
  - TestNG integration
  - Maven project structure
  - Clean separation between test and page classes
  - Scalable and maintainable design
  - Structured folder organization

execution_flow:

  - TestNG Test Class executes
  - LandingPage initialized
  - User login performed
  - Product added to cart
  - Checkout process executed
  - Order confirmation validated

# Dependencies

dependencies:

  - Selenium WebDriver
  - TestNG
  - WebDriverManager
  - Maven Surefire Plugin

# How To Run

execution_steps:

  via_ide:
    - Import as Maven Project
    - Update Maven Dependencies
    - Right click on TestNG test file
    - Run as TestNG Test
  via_maven:
    command: mvn clean test

# Framework Advantages

  - High code reusability
  - Easy maintenance
  - Clear architecture
  - Reduced code duplication
  - Enterprise-level framework structure

# Future Enhancement

  - Data Driven Testing (Excel/JSON)
  - Extent Reports integration
  - Screenshot capture on failure
  - CI/CD integration (Jenkins/GitHub Actions)
  - Parallel execution
  - Cross-browser testing
