exports.handler = function(context, event, callback) {

    const authToken = context.AUTH_TOKEN
    
    const url = String("https://your_url?bodySHA256=" + event.bodySHA256)
    const client = require('twilio')
    const twilioSignature= event.request.headers['x-twilio-signature']
    let params = {}
    
    console.log(client.validateRequest(authToken, twilioSignature, url, params));
    
    return callback(null, "response");
    };