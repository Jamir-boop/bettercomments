package com.automationanywhere.botcommand;

import com.automationanywhere.bot.service.GlobalSessionContext;
import com.automationanywhere.botcommand.data.Value;
import com.automationanywhere.botcommand.data.model.image.Image;
import com.automationanywhere.botcommand.exception.BotCommandException;
import com.automationanywhere.commandsdk.i18n.Messages;
import com.automationanywhere.commandsdk.i18n.MessagesFactory;
import java.lang.ClassCastException;
import java.lang.Deprecated;
import java.lang.Object;
import java.lang.String;
import java.lang.Throwable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public final class BetterCommentsCommand implements BotCommand {
  private static final Logger logger = LogManager.getLogger(BetterCommentsCommand.class);

  private static final Messages MESSAGES_GENERIC = MessagesFactory.getMessages("com.automationanywhere.commandsdk.generic.messages");

  @Deprecated
  public Optional<Value> execute(Map<String, Value> parameters, Map<String, Object> sessionMap) {
    return execute(null, parameters, sessionMap);
  }

  public Optional<Value> execute(GlobalSessionContext globalSessionContext,
      Map<String, Value> parameters, Map<String, Object> sessionMap) {
    logger.traceEntry(() -> parameters != null ? parameters.entrySet().stream().filter(en -> !Arrays.asList( new String[] {}).contains(en.getKey()) && en.getValue() != null).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue)).toString() : null, ()-> sessionMap != null ?sessionMap.toString() : null);
    BetterComments command = new BetterComments();
    HashMap<String, Object> convertedParameters = new HashMap<String, Object>();
    if(parameters.containsKey("firstString") && parameters.get("firstString") != null && parameters.get("firstString").get() != null) {
      convertedParameters.put("firstString", parameters.get("firstString").get());
      if(convertedParameters.get("firstString") !=null && !(convertedParameters.get("firstString") instanceof String)) {
        throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","firstString", "String", parameters.get("firstString").get().getClass().getSimpleName()));
      }
    }

    if(parameters.containsKey("codeBlockString") && parameters.get("codeBlockString") != null && parameters.get("codeBlockString").get() != null) {
      convertedParameters.put("codeBlockString", parameters.get("codeBlockString").get());
      if(convertedParameters.get("codeBlockString") !=null && !(convertedParameters.get("codeBlockString") instanceof String)) {
        throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","codeBlockString", "String", parameters.get("codeBlockString").get().getClass().getSimpleName()));
      }
    }

    if(parameters.containsKey("imageString") && parameters.get("imageString") != null && parameters.get("imageString").get() != null) {
      convertedParameters.put("imageString", parameters.get("imageString").get());
      if(convertedParameters.get("imageString") !=null && !(convertedParameters.get("imageString") instanceof Image)) {
        throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","imageString", "Image", parameters.get("imageString").get().getClass().getSimpleName()));
      }
    }

    try {
      command.action((String)convertedParameters.get("firstString"),(String)convertedParameters.get("codeBlockString"),(Image)convertedParameters.get("imageString"));Optional<Value> result = Optional.empty();
      return logger.traceExit(result);
    }
    catch (ClassCastException e) {
      throw new BotCommandException(MESSAGES_GENERIC.getString("generic.IllegalParameters","action"));
    }
    catch (BotCommandException e) {
      logger.fatal(e.getMessage(),e);
      throw e;
    }
    catch (Throwable e) {
      logger.fatal(e.getMessage(),e);
      throw new BotCommandException(MESSAGES_GENERIC.getString("generic.NotBotCommandException",e.getMessage()),e);
    }
  }

  public Map<String, Value> executeAndReturnMany(GlobalSessionContext globalSessionContext,
      Map<String, Value> parameters, Map<String, Object> sessionMap) {
    return null;
  }
}
