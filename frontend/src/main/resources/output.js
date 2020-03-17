(function (_, Kotlin, $module$render) {
  'use strict';
  var Unit = Kotlin.kotlin.Unit;
  var throwCCE = Kotlin.throwCCE;
  var lib = $module$render.com.github.estore.render.lib;
  var ensureNotNull = Kotlin.ensureNotNull;
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  function main$lambda(it) {
    Routing_getInstance().run();
    return Unit;
  }
  function main() {
    document.addEventListener('DOMContentLoaded', main$lambda);
  }
  function Routing() {
    Routing_instance = this;
  }
  function Routing$run$lambda(it) {
    var tmp$, tmp$_0, tmp$_1, tmp$_2;
    if (Kotlin.isType(it, MouseEvent) && Kotlin.isType(it.target, HTMLAnchorElement)) {
      it.preventDefault();
      var lnk = Kotlin.isType(tmp$ = it.target, HTMLAnchorElement) ? tmp$ : throwCCE();
      var view = lib.RoutesHandler.handle_61zpoe$(lnk.pathname);
      if (view == null) {
        view = lib.RoutesHandler.handle_61zpoe$(lib.Routes.NOT_FOUND_URL);
      }
      var doc = (new DOMParser()).parseFromString(ensureNotNull(view != null ? view.html : null), 'text/xml');
      var bodyHtml = (tmp$_1 = (tmp$_0 = doc.getElementsByTagName('body')[0]) != null ? tmp$_0.innerHTML : null) != null ? tmp$_1 : '';
      (tmp$_2 = document.body) != null ? (tmp$_2.innerHTML = bodyHtml) : null;
      window.history.pushState(null, '', lnk.pathname);
    }
    return Unit;
  }
  Routing.prototype.run = function () {
    document.addEventListener('click', Routing$run$lambda);
  };
  Routing.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Routing',
    interfaces: []
  };
  var Routing_instance = null;
  function Routing_getInstance() {
    if (Routing_instance === null) {
      new Routing();
    }
    return Routing_instance;
  }
  _.main = main;
  Object.defineProperty(_, 'Routing', {
    get: Routing_getInstance
  });
  main();
  Kotlin.defineModule('output', _);
  return _;
}(module.exports, require('kotlin'), require('render')));

//# sourceMappingURL=output.js.map
