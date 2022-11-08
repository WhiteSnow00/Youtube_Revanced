import java.util.Iterator;
import java.util.Set;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.regex.Pattern;
import java.util.HashSet;
import com.google.android.libraries.youtube.common.annotation.SubstringBackup;
import java.util.Collection;
import com.google.android.libraries.backup.Backup;
import com.google.android.apps.youtube.app.application.backup.YouTubeBackupAgent;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewh
{
    public static final oae a;
    
    static {
        final Class[] a2 = YouTubeBackupAgent.a;
        final oaf oaf = new oaf((Collection)oaw.c((Class)Backup.class, YouTubeBackupAgent.a), 1);
        final Set c = oaw.c((Class)SubstringBackup.class, YouTubeBackupAgent.a);
        final HashSet set = new HashSet();
        final Iterator iterator = c.iterator();
        while (iterator.hasNext()) {
            set.add(new oaf(Pattern.compile((String)iterator.next()), 0));
        }
        final ArrayList list = new ArrayList();
        final Iterator iterator2 = set.iterator();
        while (iterator2.hasNext()) {
            list.add(iterator2.next());
        }
        a = oaw.b((Iterable)Arrays.asList((oae)oaf, oaw.b((Iterable)new ArrayList(list))));
    }
}
