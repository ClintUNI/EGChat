package message;

import java.text.SimpleDateFormat;
import java.util.Date;

    public class TimestampMessage implements Message {
        private Message decoratedMessage;

        public TimestampMessage(Message decoratedMessage) {
            this.decoratedMessage = decoratedMessage;
        }

        @Override
        public String getMessage() {
            String timestamp = getCurrentTimestamp();
            return timestamp + " " + decoratedMessage.getMessage();
        }

        @Override
        public void sendMessage() {
            System.out.println(getMessage());
        }

        private String getCurrentTimestamp() {
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            return dateFormat.format(new Date());
        }
    }
