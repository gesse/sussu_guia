(function() {

  $(function() {
    return $.get("/bars", function(data) {
      return $.each(data, function(index, item) {
        return $("#bars").append("<li>Bar " + item.name + "</li>");
      });
    });
  });

}).call(this);
