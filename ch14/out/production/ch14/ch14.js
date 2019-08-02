if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'ch14'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'ch14'.");
}
var ch14 = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function main() {
    var outputMessage = 'Hello Kotlin JavaScript';
    println(outputMessage);
    jQuery('body').append('<h1>We Added A Heading!!<\/h1>');
    var someObject = null;
    someObject.invokeAnything();
  }
  _.main = main;
  main();
  Kotlin.defineModule('ch14', _);
  return _;
}(typeof ch14 === 'undefined' ? {} : ch14, kotlin);
