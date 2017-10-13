var exec = require('cordova/exec');

exports.connect = function(token, success, error) {
    exec(success, error, "RCcall", "connect", [token]);
};
exports.voiceCall = function(success, error) {
    exec(success, error, "RCcall", "voiceCall", []);
};