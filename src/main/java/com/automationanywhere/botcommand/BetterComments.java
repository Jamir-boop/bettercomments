package com.automationanywhere.botcommand;

import com.automationanywhere.botcommand.data.model.image.Image;
import com.automationanywhere.commandsdk.annotations.BotCommand;
import com.automationanywhere.commandsdk.annotations.CommandPkg;
import com.automationanywhere.commandsdk.annotations.Execute;
import com.automationanywhere.commandsdk.annotations.Idx;
import com.automationanywhere.commandsdk.annotations.Pkg;
import com.automationanywhere.commandsdk.model.DataType;
import com.automationanywhere.botcommand.data.Value;

import java.util.Map;

import static com.automationanywhere.commandsdk.model.AttributeType.*;

@BotCommand
@CommandPkg(
        name = "BetterComments",
        label = "[[BetterComments.label]]",
        node_label = "{{firstString}} {{detailAboutImage}} {{detailAboutImage2}} {{detailAboutImage3}}",
        description = "[[BetterComments.description]]",
        icon = "comment.svg",
        return_type = DataType.NONE,
        multiple_returns = {},
        documentation_url = "https://github.com/Jamir-boop/bettercomments",
        text_color = "#3b8f33",
        comment = true
)
public class BetterComments {

    private void executeAction() {
        //
    }

    @Execute
    public void action(
            @Idx(index = "1", type = TEXT)
            @Pkg(label = "[[BetterComments.firstString.label]]")
            String firstString,

            @Idx(index = "2", type = HTML)
            @Pkg(label = "[[BetterComments.HTML.label]]")
            Map<String, Value> aboutDescription,

            @Idx(index = "3", type = CODE)
            @Pkg(label = "[[BetterComments.codeBlockString.label]]")
            String codeBlockString,

            @Idx(index = "4", type = CHECKBOX)
            @Pkg(label = "Capture image")
            Boolean imageCheckbox,

            @Idx(index = "4.1", type = IMAGE)
            @Pkg(label = "[[BetterComments.imageString.label]]")
            Image imageString,

            @Idx(index = "4.2", type = TEXT)
            @Pkg(label = "Detail about captured image")
            String detailAboutImage,

            @Idx(index = "5", type = CHECKBOX)
            @Pkg(label = "Capture image")
            Boolean imageCheckbox2,

            @Idx(index = "5.1", type = IMAGE)
            @Pkg(label = "[[BetterComments.imageString.label]]")
            Image imageString2,

            @Idx(index = "5.2", type = TEXT)
            @Pkg(label = "Detail about captured image")
             String detailAboutImage2,

            @Idx(index = "6", type = CHECKBOX)
            @Pkg(label = "Capture image")
            Boolean imageCheckbox3,

            @Idx(index = "6.1", type = IMAGE)
            @Pkg(label = "[[BetterComments.imageString.label]]")
            Image imageString3,

            @Idx(index = "6.2", type = TEXT)
            @Pkg(label = "Detail about captured image")
             String detailAboutImage3

    ) {
        executeAction();
    }

    public void action(
            String firstString,
            Map<String, Value> aboutDescription,
            String codeBlockString,
            Image imageString
    ) {
        action(
                firstString,
                aboutDescription,
                codeBlockString,
                imageString != null,
                imageString,
                null,
                false,
                null,
                null,
                false,
                null,
                null
        );
    }
}
