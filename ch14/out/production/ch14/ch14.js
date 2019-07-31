if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'ch14'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'ch14'.");
}
var ch14 = function (_, Kotlin) {
  'use strict';
  var println = Kotlin.kotlin.io.println_s8jyv4$;
  function main(args) {
    var message = 'Hello Kotlin JavaScript';
    println(message);
  }
  _.main_kand9s$ = main;
  main([]);
  Kotlin.defineModule('ch14', _);
  return _;
}(typeof ch14 === 'undefined' ? {} : ch14, kotlin);
