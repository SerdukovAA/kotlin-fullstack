if (typeof kotlin === 'undefined') {
  throw new Error("Error loading module 'render'. Its dependency 'kotlin' was not found. Please, check whether 'kotlin' is loaded prior to 'render'.");
}
if (typeof this['kotlinx-html-js'] === 'undefined') {
  throw new Error("Error loading module 'render'. Its dependency 'kotlinx-html-js' was not found. Please, check whether 'kotlinx-html-js' is loaded prior to 'render'.");
}
var render = function (_, Kotlin, $module$kotlinx_html_js) {
  'use strict';
  var Kind_OBJECT = Kotlin.Kind.OBJECT;
  var Unit = Kotlin.kotlin.Unit;
  var script = $module$kotlinx_html_js.kotlinx.html.script_fglb7v$;
  var head = $module$kotlinx_html_js.kotlinx.html.head_cwj6vx$;
  var set_style = $module$kotlinx_html_js.kotlinx.html.set_style_ueiko3$;
  var body = $module$kotlinx_html_js.kotlinx.html.body_qwuuhi$;
  var set_id = $module$kotlinx_html_js.kotlinx.html.set_id_ueiko3$;
  var div = $module$kotlinx_html_js.kotlinx.html.div_ri36nr$;
  var a = $module$kotlinx_html_js.kotlinx.html.a_gu26kr$;
  var unsafe = $module$kotlinx_html_js.kotlinx.html.unsafe_vdrn79$;
  var style = $module$kotlinx_html_js.kotlinx.html.style_st6e4p$;
  var Any = Object;
  var Kind_CLASS = Kotlin.Kind.CLASS;
  var split = Kotlin.kotlin.text.split_ip8yn$;
  var zip = Kotlin.kotlin.collections.zip_45mdf7$;
  var equals = Kotlin.equals;
  var Regex_init = Kotlin.kotlin.text.Regex_init_61zpoe$;
  var createHTML = $module$kotlinx_html_js.kotlinx.html.stream.createHTML_dqye30$;
  var h1 = $module$kotlinx_html_js.kotlinx.html.h1_vmej1w$;
  var html = $module$kotlinx_html_js.kotlinx.html.html_ym5t9t$;
  function RoutingConfiguration() {
    RoutingConfiguration_instance = this;
    Routes_getInstance().page_ilr04k$('/product/{id}', RoutingConfiguration_init$lambda);
    Routes_getInstance().page_ilr04k$('/index', RoutingConfiguration_init$lambda_0);
    Routes_getInstance().page_ilr04k$('/help', RoutingConfiguration_init$lambda_1);
    Routes_getInstance().page_ilr04k$('/index/{path}/gut', RoutingConfiguration_init$lambda_2);
    Routes_getInstance().page_ilr04k$(Routes_getInstance().NOT_FOUND_URL, RoutingConfiguration_init$lambda_3);
  }
  function RoutingConfiguration_init$lambda($receiver) {
    var id = $receiver.call.get_11rb$('id');
    return ProductRender_getInstance().pageForOneProduct_pdl1vj$(id);
  }
  function RoutingConfiguration_init$lambda_0($receiver) {
    return IndexPage_getInstance().indexPage();
  }
  function RoutingConfiguration_init$lambda_1($receiver) {
    return HelpPage_getInstance().helpPage();
  }
  function RoutingConfiguration_init$lambda_2($receiver) {
    return IndexPage_getInstance().indexPage();
  }
  function RoutingConfiguration_init$lambda_3($receiver) {
    return NotFoundRender_getInstance().pageNotFound();
  }
  RoutingConfiguration.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'RoutingConfiguration',
    interfaces: []
  };
  var RoutingConfiguration_instance = null;
  function RoutingConfiguration_getInstance() {
    if (RoutingConfiguration_instance === null) {
      new RoutingConfiguration();
    }
    return RoutingConfiguration_instance;
  }
  function mainHead$lambda$lambda($receiver) {
    $receiver.src = '/kotlin.js';
    return Unit;
  }
  function mainHead$lambda$lambda_0($receiver) {
    $receiver.src = '/kotlinx-html-js.js';
    return Unit;
  }
  function mainHead$lambda$lambda_1($receiver) {
    $receiver.src = '/render.js';
    return Unit;
  }
  function mainHead$lambda$lambda_2($receiver) {
    $receiver.src = '/script.js';
    return Unit;
  }
  function mainHead$lambda($receiver) {
    script($receiver, void 0, void 0, mainHead$lambda$lambda);
    script($receiver, void 0, void 0, mainHead$lambda$lambda_0);
    script($receiver, void 0, void 0, mainHead$lambda$lambda_1);
    script($receiver, void 0, void 0, mainHead$lambda$lambda_2);
    generalStyle($receiver);
    return Unit;
  }
  function mainHead($receiver) {
    head($receiver, mainHead$lambda);
  }
  function mainLayoutWithTitleBar$lambda$lambda$lambda(closure$content) {
    return function ($receiver) {
      closure$content($receiver);
      return Unit;
    };
  }
  function mainLayoutWithTitleBar$lambda$lambda(closure$content) {
    return function ($receiver) {
      titleToolBar($receiver, 'SupportTerminal');
      leftMenuWithContent($receiver, mainLayoutWithTitleBar$lambda$lambda$lambda(closure$content));
      return Unit;
    };
  }
  function mainLayoutWithTitleBar$lambda(closure$content) {
    return function ($receiver) {
      set_style($receiver, 'margin:0');
      mainContainer($receiver, mainLayoutWithTitleBar$lambda$lambda(closure$content));
      return Unit;
    };
  }
  function mainLayoutWithTitleBar($receiver, content) {
    body($receiver, void 0, mainLayoutWithTitleBar$lambda(content));
  }
  function mainContainer$lambda(closure$content) {
    return function ($receiver) {
      set_id($receiver, 'mainContainer');
      set_style($receiver, ' display: flex; flex-direction: column; min-height: 100%;');
      closure$content($receiver);
      return Unit;
    };
  }
  function mainContainer($receiver, content) {
    div($receiver, void 0, mainContainer$lambda(content));
  }
  function titleToolBar$lambda(closure$title) {
    return function ($receiver) {
      set_id($receiver, 'titleToolBar');
      set_style($receiver, ' height: 50px; background-color: #999; border-bottom:1px solid #333 ');
      $receiver.unaryPlus_pdl1vz$(closure$title);
      return Unit;
    };
  }
  function titleToolBar($receiver, title) {
    div($receiver, void 0, titleToolBar$lambda(title));
  }
  function leftMenuWithContent$lambda$lambda$lambda($receiver) {
    set_style($receiver, 'font-size:25px;');
    $receiver.href = '/index';
    $receiver.unaryPlus_pdl1vz$('Index');
    return Unit;
  }
  function leftMenuWithContent$lambda$lambda$lambda_0($receiver) {
    set_style($receiver, 'font-size:25px;');
    $receiver.href = '/help';
    $receiver.unaryPlus_pdl1vz$('Help');
    return Unit;
  }
  function leftMenuWithContent$lambda$lambda$lambda_1($receiver) {
    set_style($receiver, 'font-size:25px;');
    $receiver.href = '/fuck';
    $receiver.unaryPlus_pdl1vz$('Fuck');
    return Unit;
  }
  function leftMenuWithContent$lambda$lambda($receiver) {
    set_id($receiver, 'leftSideMenu');
    set_style($receiver, ' width: 80px; border-right:1px solid #333;display: flex; flex-direction: column;');
    a($receiver, void 0, void 0, void 0, leftMenuWithContent$lambda$lambda$lambda);
    a($receiver, void 0, void 0, void 0, leftMenuWithContent$lambda$lambda$lambda_0);
    a($receiver, void 0, void 0, void 0, leftMenuWithContent$lambda$lambda$lambda_1);
    return Unit;
  }
  function leftMenuWithContent$lambda$lambda_0(closure$content) {
    return function ($receiver) {
      set_id($receiver, 'rightSideContent');
      set_style($receiver, ' flex: auto ');
      closure$content($receiver);
      return Unit;
    };
  }
  function leftMenuWithContent$lambda(closure$content) {
    return function ($receiver) {
      set_id($receiver, 'leftMenuWithContent');
      set_style($receiver, ' display: flex; flex:auto; background-color: #DDD;');
      div($receiver, void 0, leftMenuWithContent$lambda$lambda);
      div($receiver, void 0, leftMenuWithContent$lambda$lambda_0(closure$content));
      return Unit;
    };
  }
  function leftMenuWithContent($receiver, content) {
    div($receiver, void 0, leftMenuWithContent$lambda(content));
  }
  function generalStyle$lambda$lambda($receiver) {
    $receiver.raw_61zpoe$('\n\n                        ');
    return Unit;
  }
  function generalStyle$lambda($receiver) {
    unsafe($receiver, generalStyle$lambda$lambda);
    return Unit;
  }
  function generalStyle($receiver) {
    style($receiver, void 0, generalStyle$lambda);
  }
  function ModelAndView(html, model) {
    if (html === void 0)
      html = '';
    if (model === void 0)
      model = new Any();
    this.html = html;
    this.model = model;
  }
  ModelAndView.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'ModelAndView',
    interfaces: []
  };
  ModelAndView.prototype.component1 = function () {
    return this.html;
  };
  ModelAndView.prototype.component2 = function () {
    return this.model;
  };
  ModelAndView.prototype.copy_bm4g0d$ = function (html, model) {
    return new ModelAndView(html === void 0 ? this.html : html, model === void 0 ? this.model : model);
  };
  ModelAndView.prototype.toString = function () {
    return 'ModelAndView(html=' + Kotlin.toString(this.html) + (', model=' + Kotlin.toString(this.model)) + ')';
  };
  ModelAndView.prototype.hashCode = function () {
    var result = 0;
    result = result * 31 + Kotlin.hashCode(this.html) | 0;
    result = result * 31 + Kotlin.hashCode(this.model) | 0;
    return result;
  };
  ModelAndView.prototype.equals = function (other) {
    return this === other || (other !== null && (typeof other === 'object' && (Object.getPrototypeOf(this) === Object.getPrototypeOf(other) && (Kotlin.equals(this.html, other.html) && Kotlin.equals(this.model, other.model)))));
  };
  var emptyMap = Kotlin.kotlin.collections.emptyMap_q3lmfv$;
  function RoutContext(path) {
    this.context = emptyMap();
  }
  Object.defineProperty(RoutContext.prototype, 'call', {
    get: function () {
      return this.context;
    }
  });
  RoutContext.$metadata$ = {
    kind: Kind_CLASS,
    simpleName: 'RoutContext',
    interfaces: []
  };
  var LinkedHashMap_init = Kotlin.kotlin.collections.LinkedHashMap_init_q3lmfv$;
  function Routes() {
    Routes_instance = this;
    this.NOT_FOUND_URL = '/404';
    this.routes = LinkedHashMap_init();
  }
  function Routes$page$lambda(closure$contextFun) {
    return function (path) {
      return closure$contextFun(new RoutContext(path));
    };
  }
  Routes.prototype.page_ilr04k$ = function (pathTemplate, contextFun) {
    this.routes.put_xwzc9p$(pathTemplate, Routes$page$lambda(contextFun));
  };
  Routes.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'Routes',
    interfaces: []
  };
  var Routes_instance = null;
  function Routes_getInstance() {
    if (Routes_instance === null) {
      new Routes();
    }
    return Routes_instance;
  }
  function page$lambda(closure$contextFun) {
    return function (path) {
      return closure$contextFun(new RoutContext(path));
    };
  }
  function page($receiver, pathTemplate, contextFun) {
    Routes_getInstance().routes.put_xwzc9p$(pathTemplate, page$lambda(contextFun));
  }
  function get_routes($receiver) {
    return Routes_getInstance().routes.keys;
  }
  function RoutesHandler() {
    RoutesHandler_instance = this;
    this.PATH_VARIABLE_PLACE_HOLDER_0 = Regex_init('\\{[\\s\\S]+\\}');
    RoutingConfiguration_getInstance();
  }
  RoutesHandler.prototype.handle_61zpoe$ = function (path) {
    var tmp$;
    var resultView = null;
    tmp$ = Routes_getInstance().routes.entries.iterator();
    while (tmp$.hasNext()) {
      var tmp$_0 = tmp$.next();
      var pathTemplate = tmp$_0.key;
      var handler = tmp$_0.value;
      if (this.isPathMatchTemplate_puj7f4$(path, pathTemplate)) {
        resultView = handler(path);
        break;
      }
    }
    return resultView;
  };
  RoutesHandler.prototype.isPathMatchTemplate_puj7f4$ = function (path, template) {
    var tmp$;
    var pathParts = split(split(path, ['?']).get_za3lpa$(0), ['/']);
    var templateParts = split(split(template, ['?']).get_za3lpa$(0), ['/']);
    if (templateParts.size !== pathParts.size) {
      return false;
    }
    var pathsPairs = zip(templateParts, pathParts);
    tmp$ = pathsPairs.iterator();
    while (tmp$.hasNext()) {
      var tmp$_0 = tmp$.next();
      var t = tmp$_0.component1()
      , p = tmp$_0.component2();
      if (!equals(t, p) && !this.PATH_VARIABLE_PLACE_HOLDER_0.matches_6bul2c$(t)) {
        return false;
      }
    }
    return true;
  };
  RoutesHandler.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'RoutesHandler',
    interfaces: []
  };
  var RoutesHandler_instance = null;
  function RoutesHandler_getInstance() {
    if (RoutesHandler_instance === null) {
      new RoutesHandler();
    }
    return RoutesHandler_instance;
  }
  function HelpPage() {
    HelpPage_instance = this;
  }
  function HelpPage$helpPage$lambda$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('Help Content');
    return Unit;
  }
  function HelpPage$helpPage$lambda$lambda$lambda($receiver) {
    h1($receiver, void 0, HelpPage$helpPage$lambda$lambda$lambda$lambda);
    return Unit;
  }
  function HelpPage$helpPage$lambda$lambda($receiver) {
    div($receiver, void 0, HelpPage$helpPage$lambda$lambda$lambda);
    return Unit;
  }
  function HelpPage$helpPage$lambda($receiver) {
    mainHead($receiver);
    mainLayoutWithTitleBar($receiver, HelpPage$helpPage$lambda$lambda);
    return Unit;
  }
  HelpPage.prototype.helpPage = function () {
    var html_0 = html(createHTML(), void 0, HelpPage$helpPage$lambda);
    return new ModelAndView(html_0);
  };
  HelpPage.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'HelpPage',
    interfaces: []
  };
  var HelpPage_instance = null;
  function HelpPage_getInstance() {
    if (HelpPage_instance === null) {
      new HelpPage();
    }
    return HelpPage_instance;
  }
  function IndexPage() {
    IndexPage_instance = this;
  }
  function IndexPage$indexPage$lambda$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('Index Content');
    return Unit;
  }
  function IndexPage$indexPage$lambda$lambda$lambda($receiver) {
    h1($receiver, void 0, IndexPage$indexPage$lambda$lambda$lambda$lambda);
    return Unit;
  }
  function IndexPage$indexPage$lambda$lambda($receiver) {
    div($receiver, void 0, IndexPage$indexPage$lambda$lambda$lambda);
    return Unit;
  }
  function IndexPage$indexPage$lambda($receiver) {
    mainHead($receiver);
    mainLayoutWithTitleBar($receiver, IndexPage$indexPage$lambda$lambda);
    return Unit;
  }
  IndexPage.prototype.indexPage = function () {
    var html_0 = html(createHTML(), void 0, IndexPage$indexPage$lambda);
    return new ModelAndView(html_0);
  };
  IndexPage.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'IndexPage',
    interfaces: []
  };
  var IndexPage_instance = null;
  function IndexPage_getInstance() {
    if (IndexPage_instance === null) {
      new IndexPage();
    }
    return IndexPage_instance;
  }
  function NotFoundRender() {
    NotFoundRender_instance = this;
  }
  function NotFoundRender$pageNotFound$lambda$lambda$lambda$lambda($receiver) {
    $receiver.unaryPlus_pdl1vz$('404 Not Found');
    return Unit;
  }
  function NotFoundRender$pageNotFound$lambda$lambda$lambda($receiver) {
    h1($receiver, void 0, NotFoundRender$pageNotFound$lambda$lambda$lambda$lambda);
    return Unit;
  }
  function NotFoundRender$pageNotFound$lambda$lambda($receiver) {
    div($receiver, void 0, NotFoundRender$pageNotFound$lambda$lambda$lambda);
    return Unit;
  }
  function NotFoundRender$pageNotFound$lambda($receiver) {
    mainHead($receiver);
    mainLayoutWithTitleBar($receiver, NotFoundRender$pageNotFound$lambda$lambda);
    return Unit;
  }
  NotFoundRender.prototype.pageNotFound = function () {
    var html_0 = html(createHTML(), void 0, NotFoundRender$pageNotFound$lambda);
    return new ModelAndView(html_0);
  };
  NotFoundRender.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'NotFoundRender',
    interfaces: []
  };
  var NotFoundRender_instance = null;
  function NotFoundRender_getInstance() {
    if (NotFoundRender_instance === null) {
      new NotFoundRender();
    }
    return NotFoundRender_instance;
  }
  function ProductRender() {
    ProductRender_instance = this;
  }
  ProductRender.prototype.pageForOneProduct_pdl1vj$ = function (id) {
    return new ModelAndView('<h4>Product<\/h4>', new Any());
  };
  ProductRender.$metadata$ = {
    kind: Kind_OBJECT,
    simpleName: 'ProductRender',
    interfaces: []
  };
  var ProductRender_instance = null;
  function ProductRender_getInstance() {
    if (ProductRender_instance === null) {
      new ProductRender();
    }
    return ProductRender_instance;
  }
  var package$com = _.com || (_.com = {});
  var package$nixvision = package$com.nixvision || (package$com.nixvision = {});
  var package$support = package$nixvision.support || (package$nixvision.support = {});
  var package$terminal = package$support.terminal || (package$support.terminal = {});
  var package$render = package$terminal.render || (package$terminal.render = {});
  Object.defineProperty(package$render, 'RoutingConfiguration', {
    get: RoutingConfiguration_getInstance
  });
  var package$components = package$render.components || (package$render.components = {});
  package$components.mainHead_2lqpi0$ = mainHead;
  package$components.mainLayoutWithTitleBar_ag1nhi$ = mainLayoutWithTitleBar;
  package$components.mainContainer_bfvtv5$ = mainContainer;
  package$components.titleToolBar_4ygvh0$ = titleToolBar;
  package$components.leftMenuWithContent_rgs0fs$ = leftMenuWithContent;
  package$components.generalStyle_2lgvlv$ = generalStyle;
  var package$lib = package$render.lib || (package$render.lib = {});
  package$lib.ModelAndView = ModelAndView;
  package$lib.RoutContext = RoutContext;
  Object.defineProperty(package$lib, 'Routes', {
    get: Routes_getInstance
  });
  package$lib.page_qxplmg$ = page;
  package$lib.get_routes_q7tqfw$ = get_routes;
  Object.defineProperty(package$lib, 'RoutesHandler', {
    get: RoutesHandler_getInstance
  });
  var package$pages = package$render.pages || (package$render.pages = {});
  Object.defineProperty(package$pages, 'HelpPage', {
    get: HelpPage_getInstance
  });
  Object.defineProperty(package$pages, 'IndexPage', {
    get: IndexPage_getInstance
  });
  Object.defineProperty(package$pages, 'NotFoundRender', {
    get: NotFoundRender_getInstance
  });
  Object.defineProperty(package$pages, 'ProductRender', {
    get: ProductRender_getInstance
  });
  Kotlin.defineModule('render', _);
  return _;
}(typeof render === 'undefined' ? {} : render, kotlin, this['kotlinx-html-js']);
