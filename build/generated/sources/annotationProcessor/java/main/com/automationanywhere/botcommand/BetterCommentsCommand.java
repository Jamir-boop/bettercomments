package com.automationanywhere.botcommand;

import com.automationanywhere.bot.service.GlobalSessionContext;
import com.automationanywhere.botcommand.data.Value;
import com.automationanywhere.botcommand.data.model.image.Image;
import com.automationanywhere.botcommand.exception.BotCommandException;
import com.automationanywhere.commandsdk.i18n.Messages;
import com.automationanywhere.commandsdk.i18n.MessagesFactory;
import java.lang.Boolean;
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

    if(parameters.containsKey("aboutDescription") && parameters.get("aboutDescription") != null && parameters.get("aboutDescription").get() != null) {
      convertedParameters.put("aboutDescription", parameters.get("aboutDescription").get());
      if(convertedParameters.get("aboutDescription") !=null && !(convertedParameters.get("aboutDescription") instanceof Map)) {
        throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","aboutDescription", "Map", parameters.get("aboutDescription").get().getClass().getSimpleName()));
      }
    }

    if(parameters.containsKey("codeBlockString") && parameters.get("codeBlockString") != null && parameters.get("codeBlockString").get() != null) {
      convertedParameters.put("codeBlockString", parameters.get("codeBlockString").get());
      if(convertedParameters.get("codeBlockString") !=null && !(convertedParameters.get("codeBlockString") instanceof String)) {
        throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","codeBlockString", "String", parameters.get("codeBlockString").get().getClass().getSimpleName()));
      }
    }

    if(parameters.containsKey("imageCheckbox") && parameters.get("imageCheckbox") != null && parameters.get("imageCheckbox").get() != null) {
      convertedParameters.put("imageCheckbox", parameters.get("imageCheckbox").get());
      if(convertedParameters.get("imageCheckbox") !=null && !(convertedParameters.get("imageCheckbox") instanceof Boolean)) {
        throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","imageCheckbox", "Boolean", parameters.get("imageCheckbox").get().getClass().getSimpleName()));
      }
    }
    if(convertedParameters.get("imageCheckbox") != null && (Boolean)convertedParameters.get("imageCheckbox")) {
      if(parameters.containsKey("imageString") && parameters.get("imageString") != null && parameters.get("imageString").get() != null) {
        convertedParameters.put("imageString", parameters.get("imageString").get());
        if(convertedParameters.get("imageString") !=null && !(convertedParameters.get("imageString") instanceof Image)) {
          throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","imageString", "Image", parameters.get("imageString").get().getClass().getSimpleName()));
        }
      }

      if(parameters.containsKey("detailAboutImage") && parameters.get("detailAboutImage") != null && parameters.get("detailAboutImage").get() != null) {
        convertedParameters.put("detailAboutImage", parameters.get("detailAboutImage").get());
        if(convertedParameters.get("detailAboutImage") !=null && !(convertedParameters.get("detailAboutImage") instanceof String)) {
          throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","detailAboutImage", "String", parameters.get("detailAboutImage").get().getClass().getSimpleName()));
        }
      }

    }

    if(parameters.containsKey("imageCheckbox2") && parameters.get("imageCheckbox2") != null && parameters.get("imageCheckbox2").get() != null) {
      convertedParameters.put("imageCheckbox2", parameters.get("imageCheckbox2").get());
      if(convertedParameters.get("imageCheckbox2") !=null && !(convertedParameters.get("imageCheckbox2") instanceof Boolean)) {
        throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","imageCheckbox2", "Boolean", parameters.get("imageCheckbox2").get().getClass().getSimpleName()));
      }
    }
    if(convertedParameters.get("imageCheckbox2") != null && (Boolean)convertedParameters.get("imageCheckbox2")) {
      if(parameters.containsKey("imageString2") && parameters.get("imageString2") != null && parameters.get("imageString2").get() != null) {
        convertedParameters.put("imageString2", parameters.get("imageString2").get());
        if(convertedParameters.get("imageString2") !=null && !(convertedParameters.get("imageString2") instanceof Image)) {
          throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","imageString2", "Image", parameters.get("imageString2").get().getClass().getSimpleName()));
        }
      }

      if(parameters.containsKey("detailAboutImage2") && parameters.get("detailAboutImage2") != null && parameters.get("detailAboutImage2").get() != null) {
        convertedParameters.put("detailAboutImage2", parameters.get("detailAboutImage2").get());
        if(convertedParameters.get("detailAboutImage2") !=null && !(convertedParameters.get("detailAboutImage2") instanceof String)) {
          throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","detailAboutImage2", "String", parameters.get("detailAboutImage2").get().getClass().getSimpleName()));
        }
      }

    }

    if(parameters.containsKey("imageCheckbox3") && parameters.get("imageCheckbox3") != null && parameters.get("imageCheckbox3").get() != null) {
      convertedParameters.put("imageCheckbox3", parameters.get("imageCheckbox3").get());
      if(convertedParameters.get("imageCheckbox3") !=null && !(convertedParameters.get("imageCheckbox3") instanceof Boolean)) {
        throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","imageCheckbox3", "Boolean", parameters.get("imageCheckbox3").get().getClass().getSimpleName()));
      }
    }
    if(convertedParameters.get("imageCheckbox3") != null && (Boolean)convertedParameters.get("imageCheckbox3")) {
      if(parameters.containsKey("imageString3") && parameters.get("imageString3") != null && parameters.get("imageString3").get() != null) {
        convertedParameters.put("imageString3", parameters.get("imageString3").get());
        if(convertedParameters.get("imageString3") !=null && !(convertedParameters.get("imageString3") instanceof Image)) {
          throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","imageString3", "Image", parameters.get("imageString3").get().getClass().getSimpleName()));
        }
      }

      if(parameters.containsKey("detailAboutImage3") && parameters.get("detailAboutImage3") != null && parameters.get("detailAboutImage3").get() != null) {
        convertedParameters.put("detailAboutImage3", parameters.get("detailAboutImage3").get());
        if(convertedParameters.get("detailAboutImage3") !=null && !(convertedParameters.get("detailAboutImage3") instanceof String)) {
          throw new BotCommandException(MESSAGES_GENERIC.getString("generic.UnexpectedTypeReceived","detailAboutImage3", "String", parameters.get("detailAboutImage3").get().getClass().getSimpleName()));
        }
      }

    }

    try {
      command.action((String)convertedParameters.get("firstString"),(Map<String, Value>)convertedParameters.get("aboutDescription"),(String)convertedParameters.get("codeBlockString"),(Boolean)convertedParameters.get("imageCheckbox"),(Image)convertedParameters.get("imageString"),(String)convertedParameters.get("detailAboutImage"),(Boolean)convertedParameters.get("imageCheckbox2"),(Image)convertedParameters.get("imageString2"),(String)convertedParameters.get("detailAboutImage2"),(Boolean)convertedParameters.get("imageCheckbox3"),(Image)convertedParameters.get("imageString3"),(String)convertedParameters.get("detailAboutImage3"));Optional<Value> result = Optional.empty();
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
