var socket = require('socket.io-client')('http://localhost:0403');
socket.on('connect', function(){
    
});
socket.on('event', function(data){});
socket.on('disconnect', function(){});
