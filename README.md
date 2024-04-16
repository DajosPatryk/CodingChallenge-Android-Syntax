# Coding Challenge for Syntax Institute in Android 🌱

## Task Overview
The task was to build a simple Android application with two primary views:
1. A click-counter view as the initial screen.
2. A list of players displayed in the second view.

I was given the freedom to design both the functionality and the aesthetics of the application.

## Implementation Details
I utilized the View Binding architecture to manage the UI components more efficiently, ensuring that each view could handle user interactions robustly. The app comprises two main views:
- **Click-Counter View**: This view allows users to interact with a simple interface that counts and displays each tap.
- **Players List View**: This view uses a RecyclerView to display a list of players. The data for the players is stored in-memory within a data directory, specifically designed to handle these entities.

### Key Features
- **View Binding**: Enhanced the code readability and safety by implementing View Binding, which replaces findViewById and provides compile-time type safety for referencing views directly.
- **In-Memory Data Storage**: Players' data is temporarily stored in-memory, making the retrieval process fast and efficient for the RecyclerView.
- **RecyclerView**: Implemented to display a list of players, allowing efficient memory usage when scrolling through a potentially large list of items.

### Development Time
The app was completed in approximately one hour, demonstrating efficient use of Android development tools and practices to meet the project requirements swiftly.

## Additional Notes
This project serves as a basic demonstration of handling user interactions and displaying lists of data in Android. The architecture and methods used are aligned with current best practices in Android development, focusing on simplicity and functionality.<br/>
**I utilized GPT-4 to generate texts and custom player-data.**
