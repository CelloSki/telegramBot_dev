package tutorial;

import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMediaGroup;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;


public class Bot extends TelegramLongPollingBot {

 @Override
 public String getBotUsername() {
 return "Cloud2LocalBot";
 }

 @Override
 public String getBotToken() {
 return "7831166511:AAGgCSkZA7f1REsJ8Uwn9B6JgxHDPtTETf8";
 }

 @Override
 public void onUpdateReceived(Update update) {
 Message message =update.getMessage();

 if(message.hasText()) {
     SendMessage sendMessage = new SendMessage();
     Long chatId = message.getChatId();
     sendMessage.setChatId(chatId.toString());
     sendMessage.setText("Good morning, Hello, how can i help you.");

     try {
         execute(sendMessage);
     }catch (TelegramApiException e) {
         e.printStackTrace();
     }
 }

 }
}
