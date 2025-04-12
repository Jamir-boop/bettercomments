package com.automationanywhere.botcommand;

import com.automationanywhere.commandsdk.annotations.BotCommand;
import com.automationanywhere.commandsdk.annotations.CommandPkg;
import com.automationanywhere.commandsdk.annotations.Execute;
import com.automationanywhere.commandsdk.annotations.Idx;
import com.automationanywhere.commandsdk.annotations.Pkg;
import com.automationanywhere.commandsdk.model.DataType;

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
        text_color = "#3b8f33",
        documentation_url = "https://github.com/Jamir-boop/better-automationanywhere"
)
public class BetterComments {

    @Execute
    public void action(
            @Idx(index = "1", type = TEXT)
            @Pkg(label = "[[BetterComments.firstString.label]]")
            String firstString,

            @Idx(index = "2", type = CODE)
            @Pkg(label = "[[BetterComments.codeBlockString.label]]")
            String codeBlockString,

            @Idx(index = "3", type = IMAGE)
            @Pkg(label = "[[BetterComments.imageString.label]]")
            String imageString
    ) {
        // just a visual comment
    }
}
