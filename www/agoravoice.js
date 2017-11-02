var exec = require('cordova/exec');

exports.voiceCall = function(fromUname, targetUname, success, error) {
    exec(success, error, "Agoravoice", "voiceCall", [fromUname, targetUname]);
};
exports.videoCall = function(fromUname, targetUname, success, error) {
    exec(success, error, "Agoravoice", "videoCall", [fromUname, targetUname]);
};