import java.util.Iterator;
import java.util.List;
import com.google.protos.youtube.api.innertube.RepeatChapterCommandOuterClass$RepeatChapterCommand;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class abai implements vcv
{
    private final atke a;
    private final atke b;
    private final atke c;
    
    public abai(final atke a, final atke b, final atke c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final boolean b(final long n, final long n2) {
        final abvx q = ((abpq)this.b.a()).q();
        if (q == null) {
            return false;
        }
        final long c = q.c();
        return c >= n && c < n2;
    }
    
    public final void mE(final aiqj aiqj, final Map map) {
        if (!((ahbc)aiqj).ry((ahaq)RepeatChapterCommandOuterClass$RepeatChapterCommand.repeatChapterCommand)) {
            throw new vdj();
        }
        final aazo aazo = (aazo)this.a.a();
        if (aazo == null) {
            return;
        }
        final RepeatChapterCommandOuterClass$RepeatChapterCommand repeatChapterCommandOuterClass$RepeatChapterCommand = (RepeatChapterCommandOuterClass$RepeatChapterCommand)((ahbc)aiqj).rx((ahaq)RepeatChapterCommandOuterClass$RepeatChapterCommand.repeatChapterCommand);
        int bn;
        if ((bn = aqsx.bN(repeatChapterCommandOuterClass$RepeatChapterCommand.c)) == 0) {
            bn = 1;
        }
        if (--bn != 1) {
            if (bn != 2) {
                return;
            }
            aazo.a();
        }
        else {
            final afel d = afeq.d();
            if ((repeatChapterCommandOuterClass$RepeatChapterCommand.b & 0x2) == 0x0) {
                d.h("repeat_chapter_command.start_time_ms is not filled.");
            }
            if ((repeatChapterCommandOuterClass$RepeatChapterCommand.b & 0x4) == 0x0) {
                d.h("repeat_chapter_command.end_time_ms is not filled.");
            }
            final afeq g = d.g();
            if (g.isEmpty()) {
                ((ouf)this.c.a()).c = repeatChapterCommandOuterClass$RepeatChapterCommand.f;
                final aazo aazo2 = (aazo)this.a.a();
                if (this.b(repeatChapterCommandOuterClass$RepeatChapterCommand.d, repeatChapterCommandOuterClass$RepeatChapterCommand.e)) {
                    aazo2.e(repeatChapterCommandOuterClass$RepeatChapterCommand.d, repeatChapterCommandOuterClass$RepeatChapterCommand.e);
                    return;
                }
                aazo2.a();
                aazo2.d(repeatChapterCommandOuterClass$RepeatChapterCommand.d, repeatChapterCommandOuterClass$RepeatChapterCommand.e);
            }
            else {
                final aazo aazo3 = (aazo)this.a.a();
                final afel d2 = afeq.d();
                Long n = null;
                final Long n2 = null;
                Long n3;
                if (map == null) {
                    d2.h("args is null.");
                    n3 = null;
                }
                else {
                    Label_0316: {
                        if (map.containsKey("repeat_chapter_command_resolver_start_time_ms")) {
                            if (map.get("repeat_chapter_command_resolver_start_time_ms") instanceof Long) {
                                n = map.get("repeat_chapter_command_resolver_start_time_ms");
                                break Label_0316;
                            }
                            d2.h("Value of repeat_chapter_command_resolver_start_time_ms is not a Long.");
                        }
                        else {
                            d2.h("args does not contain key: repeat_chapter_command_resolver_start_time_ms");
                        }
                        n = null;
                    }
                    if (map.containsKey("repeat_chapter_command_resolver_end_time_ms")) {
                        if (!(map.get("repeat_chapter_command_resolver_end_time_ms") instanceof Long)) {
                            d2.h("Value of repeat_chapter_command_resolver_end_time_ms is not a Long.");
                            n3 = n2;
                        }
                        else {
                            n3 = map.get("repeat_chapter_command_resolver_end_time_ms");
                        }
                    }
                    else {
                        d2.h("args does not contain key: repeat_chapter_command_resolver_end_time_ms");
                        n3 = n2;
                    }
                }
                if (n != null && n3 != null) {
                    if (this.b(n, n3)) {
                        aazo3.e(n, n3);
                    }
                    else {
                        aazo3.a();
                        aazo3.d(n, n3);
                    }
                }
                final afeq g2 = d2.g();
                if (!g2.isEmpty()) {
                    int i = 0;
                    final StringBuilder sb = new StringBuilder("There were problems with resolving RepeatChapterCommand.");
                    while (i < 2) {
                        for (final String s : (new List[] { (List)g, (List)g2 })[i]) {
                            sb.append(" ");
                            sb.append(s);
                        }
                        ++i;
                    }
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
    }
}
