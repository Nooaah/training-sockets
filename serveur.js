var http = require('http');
var io = require('socket.io');

httpServer = http.createServer(function(req, res) {
    res.end('Hello Word');
})

httpServer.listen('0403');

var io = require('socket.io').listen(httpServer);

io.sockets.on('connection', function(socket) {
    console.log('Un client est connecté');
})