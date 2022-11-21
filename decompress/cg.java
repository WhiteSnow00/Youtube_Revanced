import java.util.ArrayList;
import java.util.Map;
import android.util.Log;
import android.support.v4.app.FragmentManager$LaunchedFragmentInfo;
import androidx.activity.result.ActivityResult;

// 
// Decompiled by Procyon v0.6.0
// 

final class cg implements re
{
    final cl a;
    private final int b;
    
    public cg(final cl a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    public final void a(final Object o) {
        final int b = this.b;
        if (b != 0) {
            if (b != 1) {
                final ActivityResult activityResult = (ActivityResult)o;
                final FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo = this.a.s.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo == null) {
                    new StringBuilder("No IntentSenders were started for ").append(this);
                    Log.w("FragmentManager", "No IntentSenders were started for ".concat(this.toString()));
                    return;
                }
                final String a = fragmentManager$LaunchedFragmentInfo.a;
                final int b2 = fragmentManager$LaunchedFragmentInfo.b;
                final br c = this.a.a.c(a);
                if (c == null) {
                    Log.w("FragmentManager", "Intent Sender result delivered for unknown Fragment ".concat(String.valueOf(a)));
                    return;
                }
                c.U(b2, activityResult.a, activityResult.b);
            }
            else {
                final Map map = (Map)o;
                final String[] array = (String[])map.keySet().toArray(new String[0]);
                final ArrayList list = new ArrayList(map.values());
                final int[] array2 = new int[list.size()];
                for (int i = 0; i < list.size(); ++i) {
                    int n;
                    if (!(boolean)list.get(i)) {
                        n = -1;
                    }
                    else {
                        n = 0;
                    }
                    array2[i] = n;
                }
                final FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo2 = this.a.s.pollFirst();
                if (fragmentManager$LaunchedFragmentInfo2 == null) {
                    new StringBuilder("No permissions were requested for ").append(this);
                    Log.w("FragmentManager", "No permissions were requested for ".concat(this.toString()));
                    return;
                }
                final String a2 = fragmentManager$LaunchedFragmentInfo2.a;
                final int b3 = fragmentManager$LaunchedFragmentInfo2.b;
                final br c2 = this.a.a.c(a2);
                if (c2 == null) {
                    Log.w("FragmentManager", "Permission request result delivered for unknown Fragment ".concat(String.valueOf(a2)));
                    return;
                }
                c2.Z(b3, array, array2);
            }
        }
        else {
            final ActivityResult activityResult2 = (ActivityResult)o;
            final FragmentManager$LaunchedFragmentInfo fragmentManager$LaunchedFragmentInfo3 = this.a.s.pollFirst();
            if (fragmentManager$LaunchedFragmentInfo3 == null) {
                new StringBuilder("No Activities were started for result for ").append(this);
                Log.w("FragmentManager", "No Activities were started for result for ".concat(this.toString()));
                return;
            }
            final String a3 = fragmentManager$LaunchedFragmentInfo3.a;
            final int b4 = fragmentManager$LaunchedFragmentInfo3.b;
            final br c3 = this.a.a.c(a3);
            if (c3 == null) {
                Log.w("FragmentManager", "Activity result delivered for unknown Fragment ".concat(String.valueOf(a3)));
                return;
            }
            c3.U(b4, activityResult2.a, activityResult2.b);
        }
    }
}
