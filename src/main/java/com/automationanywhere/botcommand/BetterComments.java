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
        node_label = "{{firstString}}",
        description = "[[BetterComments.description]]",
        icon = "comment.svg",
        return_type = DataType.NONE,
        multiple_returns = {},
        documentation_url = "https://github.com/Jamir-boop/bettercomments",
        text_color = "#3b8f33",
        comment = true
)
public class BetterComments {

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

            @Idx(index = "4", type = IMAGE)
            @Pkg(label = "[[BetterComments.imageString.label]]")
            Image imageString

    ) {
        //
    }
}
