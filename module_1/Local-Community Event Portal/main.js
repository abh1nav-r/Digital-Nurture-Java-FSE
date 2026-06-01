// Welcome Message
console.log("Welcome to the Community Portal");

// Alert on Load
window.onload = function () {

    alert("Page Fully Loaded");
};

// Event Class
class Event {

    constructor(name, category, seats, date) {

        this.name = name;
        this.category = category;
        this.seats = seats;
        this.date = date;
    }
}

// Prototype Method
Event.prototype.checkAvailability = function () {

    return this.seats > 0;
};

// Event Array
const events = [

    new Event(
        "Music Festival",
        "Music",
        10,
        "2026-12-20"
    ),

    new Event(
        "Cooking Workshop",
        "Workshop",
        5,
        "2026-11-10"
    ),

    new Event(
        "Dance Show",
        "Music",
        0,
        "2024-01-01"
    )
];

// Add Event using push()
events.push(

    new Event(
        "Sports Meet",
        "Sports",
        15,
        "2026-10-15"
    )
);

// Filter Music Events
const musicOnly =
events.filter(event =>
    event.category === "Music"
);

console.log(musicOnly);

// Object.entries()
console.log(
    Object.entries(events[0])
);

// Spread Operator
const copiedEvents = [...events];

console.log(copiedEvents);

// map()
const eventNames =
events.map(event =>
    `Workshop on ${event.name}`
);

console.log(eventNames);

// Closure
function registrationCounter() {

    let total = 0;

    return function () {

        total++;

        console.log(
            "Total Registrations: " + total
        );
    };
}

const count =
registrationCounter();

count();
count();

// Higher-order Function
function filterCategory(events, callback) {

    return events.filter(callback);
}

const musicEvents =
filterCategory(events, function (event) {

    return event.category === "Music";
});

console.log(musicEvents);

// Default Parameter
function greetUser(name = "Guest") {

    console.log(
        "Welcome " + name
    );
}

greetUser();

// Session Storage
sessionStorage.setItem(
    "lastVisitedPage",
    "Home Page"
);

console.log(
    sessionStorage.getItem(
        "lastVisitedPage"
    )
);

// DOM Container
const container =
document.querySelector("#eventContainer");

// Display Events
function displayEvents(eventList) {

    container.innerHTML = "";

    eventList.forEach(event => {

        const today =
        new Date().toISOString().split("T")[0];

        if (
            !event.checkAvailability() ||
            event.date < today
        ) {

            return;
        }

        const card =
        document.createElement("div");

        card.classList.add("eventCard");

        card.innerHTML = `
            <h2>${event.name}</h2>

            <p>Category: ${event.category}</p>

            <p>Seats: ${event.seats}</p>

            <p>Date: ${event.date}</p>

            <button onclick="registerUser('${event.name}')">
                Register
            </button>
        `;

        container.appendChild(card);
    });
}

// Register User
function registerUser(eventName) {

    try {

        const event =
        events.find(e => e.name === eventName);

        if (event.seats <= 0) {

            throw "No seats available";
        }

        event.seats--;

        alert(`Registered for ${event.name}`);

        displayEvents(events);

    } catch (error) {

        alert(error);
    }
}

// Initial Display
displayEvents(events);

// Save Category
document.querySelector("#categoryFilter")
.addEventListener("change", function () {

    localStorage.setItem(
        "preferredCategory",
        this.value
    );

    const category = this.value;

    if (category === "all") {

        displayEvents(events);

    } else {

        const filtered =
        events.filter(event =>
            event.category === category
        );

        displayEvents(filtered);
    }
});

// Load Category
window.addEventListener("load", function () {

    const savedCategory =
    localStorage.getItem("preferredCategory");

    if (savedCategory) {

        document.querySelector("#categoryFilter")
        .value = savedCategory;
    }
});

// Search
document.querySelector("#searchBox")
.addEventListener("keydown", function () {

    const text =
    this.value.toLowerCase();

    const filtered =
    events.filter(event =>
        event.name.toLowerCase()
        .includes(text)
    );

    displayEvents(filtered);
});

// Clear Storage
function clearPreferences() {

    localStorage.clear();

    sessionStorage.clear();

    alert("Preferences Cleared");
}

// Video Ready
function videoReady() {

    document.querySelector("#videoMessage")
    .textContent =
    "Video ready to play";
}

// Fee
function showFee(eventName) {

    let fee = "";

    if (eventName === "Music Festival") {

        fee = "Fee: ₹500";

    } else if (
        eventName === "Sports Meet"
    ) {

        fee = "Fee: ₹400";

    } else {

        fee = "Fee: ₹300";
    }

    document.querySelector("#eventFee")
    .textContent = fee;
}

// Phone Validation
function validatePhone() {

    const phone =
    document.querySelector("#phone").value;

    if (phone.length < 10) {

        alert("Invalid Phone Number");
    }
}

// Character Count
document.querySelector("#feedback")
.addEventListener("keyup", function () {

    document.querySelector("#charCount")
    .textContent =
    "Characters: " + this.value.length;
});

// Image Enlarge
function enlargeImage(img) {

    img.style.width = "500px";
}

// Form Submit
document.querySelector("#registerForm")
.addEventListener("submit",
function (event) {

    event.preventDefault();

    const form = event.target;

    const username =
    form.elements["username"].value;

    const email =
    form.elements["email"].value;

    if (username === "" ||
        email === "") {

        document.querySelector("#error")
        .textContent =
        "All fields are required";

        return;
    }

    console.log("Form Submitted");

    console.log({
        username,
        email
    });

    document.querySelector("#loading")
    .textContent = "Loading Events...";

    setTimeout(() => {

        fetch(
            "https://jsonplaceholder.typicode.com/posts",
            {

                method: "POST",

                headers: {
                    "Content-Type":
                    "application/json"
                },

                body: JSON.stringify({
                    username,
                    email
                })
            }
        )

        .then(response => response.json())

        .then(data => {

            document.querySelector("#loading")
            .textContent = "";

            alert("Registration Successful");

            console.log(data);
        })

        .catch(error => {

            console.log(error);
        });

    }, 2000);
});

// Async Await
async function fetchEvents() {

    try {

        document.querySelector("#loading")
        .textContent = "Loading Events...";

        const response =
        await fetch(
            "https://jsonplaceholder.typicode.com/posts"
        );

        const data =
        await response.json();

        console.log(data);

        document.querySelector("#loading")
        .textContent = "";

    } catch (error) {

        console.log(error);
    }
}

fetchEvents();

// Geolocation
function findLocation() {

    if (navigator.geolocation) {

        navigator.geolocation.getCurrentPosition(

            function (position) {

                document.querySelector("#locationResult")
                .textContent =

                "Latitude: " +
                position.coords.latitude +

                " Longitude: " +
                position.coords.longitude;
            },

            function () {

                alert("Location access denied");
            },

            {
                enableHighAccuracy: true,
                timeout: 5000
            }
        );

    } else {

        alert("Geolocation not supported");
    }
}

// Before Unload
window.onbeforeunload = function () {

    return "Your form is not submitted";
};

// jQuery
$("#registerBtn").click(function () {

    $(".eventCard").fadeOut(500)
                   .fadeIn(500);
});