$.postJSON = function(url, data, callback, failure) {
    return jQuery.ajax({
        'type': 'POST',
        'url': url,
        'contentType': 'application/json',
        'data': JSON.stringify(data),
        'dataType': 'json',
        'success': callback,
        'error':failure
    });
};

$.getJSON = function(url, data, callback, failure) {
    return jQuery.ajax({
        'type': 'GET',
        'url': url,
        'contentType': 'application/json',
        'data': JSON.stringify(data),
        'dataType': 'json',
        'success': callback,
        'error':failure
    });
};
