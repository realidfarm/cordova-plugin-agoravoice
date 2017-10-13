var exec = require('cordova/exec');

exports.voiceCall = function(success, error) {
    exec(success, error, "Agoravoice", "voiceCall", []);
};
exports.videoCall = function(token, success, error) {
    exec(success, error, "Agoravoice", "videoCall", []);
};