if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'ch14'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'ch14'.");
}
var ch14 = function (_, Kotlin) {
  'use strict';
  var listOf = Kotlin.kotlin.collections.listOf_i5x0yv$;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var Unit = Kotlin.kotlin.Unit;
  var headings;
  function ViewState(title, topics) {
    this.title = title;
    this.topics = topics;
  }
  ViewState.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ViewState',
    interfaces: []
  };
  ViewState.prototype.component1 = function () {
    return this.title;
  };
  ViewState.prototype.component2 = function () {
    return this.topics;
  };
  ViewState.prototype.copy_kwv3np$ = function (title, topics) {
    return new ViewState(title === void 0 ? this.title : title, topics === void 0 ? this.topics : topics);
  };
  ViewState.prototype.toString = function () {
    return 'ViewState(title=' + Kotlin.toString(this.title) + (', topics=' + Kotlin.toString(this.topics)) + ')';
  };
  ViewState.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.title) | 0;
    result = result * 31 + Kotlin.hashCode(this.topics) | 0;
    return result;
  };
  ViewState.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.title, other.title) && Kotlin.equals(this.topics, other.topics)))));
  };
  function PagePresenter(viewStateListener) {
    this.viewStateListener_0 = viewStateListener;
    this.viewStateListener_0(new ViewState('Hello KotlinJS', headings));
  }
  PagePresenter.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'PagePresenter',
    interfaces: []
  };
  function main$lambda(it) {
    jQuery('body').append('<h1>' + it.title + '<\/h1>');
    var tmp$;
    tmp$ = it.topics.iterator();
    while (tmp$.hasNext()) {
      var element = tmp$.next();
      jQuery('body').append('<h2>' + element + '<\/h2>');
    }
    return Unit;
  }
  function main() {
    var presenter = new PagePresenter(main$lambda);
  }
  _.ViewState = ViewState;
  _.PagePresenter = PagePresenter;
  _.main = main;
  headings = listOf(['Kotlin', 'Programming', 'JavaScript']);
  main();
  Kotlin.defineModule('ch14', _);
  return _;
}(typeof ch14 === 'undefined' ? {} : ch14, kotlin);
