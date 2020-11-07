function getSelectValue() {
    var selectedValue = document.getElementById("select-list").value;
    var selectedElement = document.getElementById("js-script");
    var enquiry = '<div class="flex-content"><textarea name="question-text-area" id="question-text-area" cols="78" rows="5" placeholder="What would you like to know?"></textarea><div class="radio-grid"><div class="radio-item"><input type="radio" name="purpose" /><label for="radio">I am a Job seeker</label></div><div class="radio-item"><input type="radio" name="purpose" /><label for="radio">I am a media person</label></div><div class="radio-item"><input type="radio" name="purpose" /><label for="radio">I want to be a business partner</label></div><div class="radio-item"><input type="radio" name="purpose" /><label for="radio">I am interested in being a supplier</label></div><div class="radio-item"><input type="radio" name="purpose" /><label for="radio">Any Other</label></div></div><input class="text-field" type="text" name="f-name" placeholder="First Name*" required><input class="text-field" type="text" name="l-name" placeholder="Last Name*" required><input class="text-field" type="text" name="ph-no" placeholder="Mobile Number*"required><input class="text-field" type="email" name="email" placeholder="Email ID*" required></div>';
    var helloWorld = '<h1>Hello World</h1>';
    if (selectedValue == 0) {
        selectedElement.innerHTML = ' ';
        document.getElementById("form").setAttribute('action', ' ');
    }
    if (selectedValue == 2) {
        selectedElement.innerHTML = enquiry;
        document.getElementById("form").setAttribute('action', '#');
    }
    if (selectedValue == 1) {
        selectedElement.innerHTML = ' ';
        document.getElementById("form").setAttribute('action', './feedback.html');
    }

}