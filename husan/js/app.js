$(function () {
  var $clietHeight = $(window).height(),
      $clietWidth  = $(window).width(),
      now = 1,
      ready;

//设置第一幅华高度
  $('.section1').css({
    'height': $clietHeight+'px'
  });
//设置第二幅华高度
  $('.section2').css({
    'height': $clietHeight+'px'
  });
//设置第三幅华高度
  $('.section2').css({
    'height': $clietHeight+'px'
  });

  $(document).bind('mousewheel', function () {
    switch(now){
      case 1 :
        firstSection();
      break;
      case 2 :
        secondSection();
      break;
      case 3:
        thirdSection();
    }
  });

  $('.main').css({
    'width': $clietWidth+'px'
  });

  setTimeout(function () {
    firstSection();
  },1000);

  //当页面为第一个时
  function firstSection (argument) {
    $('body').css({
      'background': 'url(images/2.jpg)'
    });
    $('.main').animate({
      'top':'0px'
    },'slow');
    $('footer').show();
    $('.log-in').show();
    $('.sign-in').hide(300);
    now = 2;
  }

  //当页面显示为第二个时
  function secondSection (argument) {
    $('.main').animate({
      'top': -$clietHeight+'px'
    },'slow' ,function () {
      $('body').css({
        'background' : '#56bc8a'
      });
    });
    $('.sign-in').show();
    $('.log-in').show();
    $('footer').hide(300);
    now = 3;
  }

  //当页面显示为第三个时
  function thirdSection (argument) {
    $('.main').animate({
      'top': -$clietHeight*2+'px'
    },'slow', function () {
      $('body').css({
        'background': 'url(images/1.jpg)'
      });
    });

    $('.sign-in').show();
    $('footer').show(300);
    $('.log-in').hide();
    now = 1;
  }
});