import java.util.regex.PatternSyntaxException;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

final class acpa
{
    public static final Pattern a;
    
    static {
        a = a();
    }
    
    private static Pattern a() {
        try {
            return Pattern.compile("\\p{RI}\\p{RI}|(\\p{Emoji}(\\p{EMod}|\\x{FE0F}\\x{20E3}?|[\\x{E0020}-\\x{E007E}]+\\x{E007F})|[\\p{Emoji}&&\\p{So}])(\\x{200D}\\p{Emoji}(\\p{EMod}|\\x{FE0F}\\x{20E3}?|[\\x{E0020}-\\x{E007E}]+\\x{E007F})?)*");
        }
        catch (final PatternSyntaxException ex) {
            return Pattern.compile("\\p{RI}\\p{RI}|(\\p{Emoji}(\\p{EMod}|\\x{FE0F}\\x{20E3}?|[\\x{E0020}-\\x{E007E}]+\\x{E007F})|[\\p{Emoji}&&\\p{So}])(\\x{200D}\\p{Emoji}(\\p{EMod}|\\x{FE0F}\\x{20E3}?|[\\x{E0020}-\\x{E007E}]+\\x{E007F})?)*".replace("[\\p{Emoji}&&\\p{So}]", "[\\p{Cs}\\p{So}\\x{1F9B0}-\\x{1F9B3}]").replace("\\p{Emoji}", "[0-9#*\\p{Cs}\\p{So}\\x{1F9B0}-\\x{1F9B3}]").replace("\\p{RI}\\p{RI}", "[\\x{1F1E6}-\\x{1F1FF}]{2}").replace("\\p{EMod}", "[\\x{1F3FB}-\\x{1F3FF}]"));
        }
    }
}
