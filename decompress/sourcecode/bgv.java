import java.util.List;
import java.util.UUID;
import androidx.media3.common.DrmInitData;
import android.media.metrics.PlaybackStateEvent$Builder;
import android.media.metrics.NetworkEvent$Builder;
import android.media.metrics.PlaybackErrorEvent$Builder;
import android.media.MediaCodec$CryptoException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import android.system.OsConstants;
import android.system.ErrnoException;
import java.io.FileNotFoundException;
import android.media.DeniedByServerException;
import android.media.NotProvisionedException;
import android.media.MediaDrmResetException;
import android.media.MediaDrm$MediaDrmStateException;
import java.io.IOException;
import android.util.Pair;
import android.media.metrics.TrackChangeEvent$Builder;
import android.os.SystemClock;
import java.util.HashMap;
import android.content.Context;
import android.media.metrics.PlaybackMetrics$Builder;
import android.media.metrics.PlaybackSession;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bgv implements bgb, bgw
{
    private trg A;
    public final PlaybackSession a;
    public String b;
    public PlaybackMetrics$Builder c;
    private final Context d;
    private final bgx e;
    private final long f;
    private final azk g;
    private final azj h;
    private final HashMap i;
    private final HashMap j;
    private int k;
    private int l;
    private int m;
    private aza n;
    private ayf o;
    private ayf p;
    private ayf q;
    private boolean r;
    private int s;
    private boolean t;
    private int u;
    private int v;
    private int w;
    private boolean x;
    private trg y;
    private trg z;
    
    public bgv(final Context context, final PlaybackSession a) {
        this.d = context.getApplicationContext();
        this.a = a;
        this.g = new azk();
        this.h = new azj();
        this.j = new HashMap();
        this.i = new HashMap();
        this.f = SystemClock.elapsedRealtime();
        this.l = 0;
        this.m = 0;
        final bgu e = new bgu();
        this.e = e;
        final bgu bgu = e;
        e.c = this;
    }
    
    private final void aA(final long n, final ayf p3, int n2) {
        if (baw.aa(this.p, p3)) {
            return;
        }
        if (this.p == null && n2 == 0) {
            n2 = 1;
        }
        this.aD(0, n, this.p = p3, n2);
    }
    
    private final void aB(final long n, final ayf q, int n2) {
        if (baw.aa(this.q, q)) {
            return;
        }
        if (this.q == null && n2 == 0) {
            n2 = 1;
        }
        this.aD(2, n, this.q = q, n2);
    }
    
    private final void aC(final long n, final ayf o, int n2) {
        if (baw.aa(this.o, o)) {
            return;
        }
        if (this.o == null && n2 == 0) {
            n2 = 1;
        }
        this.aD(1, n, this.o = o, n2);
    }
    
    private final void aD(int n, final long n2, final ayf ayf, final int n3) {
        final TrackChangeEvent$Builder setTimeSinceCreatedMillis = new TrackChangeEvent$Builder(n).setTimeSinceCreatedMillis(n2 - this.f);
        if (ayf != null) {
            setTimeSinceCreatedMillis.setTrackState(1);
            if (n3 != 1) {
                n = 3;
                if (n3 != 2) {
                    if (n3 != 3) {
                        n = 1;
                    }
                    else {
                        n = 4;
                    }
                }
            }
            else {
                n = 2;
            }
            setTimeSinceCreatedMillis.setTrackChangeReason(n);
            final String m = ayf.m;
            if (m != null) {
                setTimeSinceCreatedMillis.setContainerMimeType(m);
            }
            final String n4 = ayf.n;
            if (n4 != null) {
                setTimeSinceCreatedMillis.setSampleMimeType(n4);
            }
            final String k = ayf.k;
            if (k != null) {
                setTimeSinceCreatedMillis.setCodecName(k);
            }
            n = ayf.j;
            if (n != -1) {
                setTimeSinceCreatedMillis.setBitrate(n);
            }
            n = ayf.s;
            if (n != -1) {
                setTimeSinceCreatedMillis.setWidth(n);
            }
            n = ayf.t;
            if (n != -1) {
                setTimeSinceCreatedMillis.setHeight(n);
            }
            n = ayf.A;
            if (n != -1) {
                setTimeSinceCreatedMillis.setChannelCount(n);
            }
            n = ayf.B;
            if (n != -1) {
                setTimeSinceCreatedMillis.setAudioSampleRate(n);
            }
            final String e = ayf.e;
            if (e != null) {
                final String[] ap = baw.ap(e, "-");
                final String s = ap[0];
                String s2;
                if (ap.length >= 2) {
                    s2 = ap[1];
                }
                else {
                    s2 = null;
                }
                final Pair create = Pair.create((Object)s, (Object)s2);
                setTimeSinceCreatedMillis.setLanguage((String)create.first);
                if (create.second != null) {
                    setTimeSinceCreatedMillis.setLanguageRegion((String)create.second);
                }
            }
            final float u = ayf.u;
            if (u != -1.0f) {
                setTimeSinceCreatedMillis.setVideoFrameRate(u);
            }
        }
        else {
            setTimeSinceCreatedMillis.setTrackState(0);
        }
        this.x = true;
        this.a.reportTrackChangeEvent(setTimeSinceCreatedMillis.build());
    }
    
    private final boolean aE(final trg trg) {
        return trg != null && ((String)trg.c).equals(this.e.b());
    }
    
    private static int az(final int n) {
        switch (baw.i(n)) {
            default: {
                return 27;
            }
            case 6005: {
                return 26;
            }
            case 6004: {
                return 25;
            }
            case 6003: {
                return 28;
            }
            case 6002: {
                return 24;
            }
        }
    }
    
    @Override
    public final void F(final bga bga, final int n, long longValue) {
        final ayx i = bga.i;
        if (i != null) {
            final String g = this.e.g(bga.b, i);
            final Long n2 = this.j.get(g);
            final Long n3 = this.i.get(g);
            final HashMap j = this.j;
            final long n4 = 0L;
            long longValue2;
            if (n2 == null) {
                longValue2 = 0L;
            }
            else {
                longValue2 = n2;
            }
            j.put(g, longValue2 + longValue);
            final HashMap k = this.i;
            if (n3 == null) {
                longValue = n4;
            }
            else {
                longValue = n3;
            }
            k.put(g, longValue + n);
        }
    }
    
    @Override
    public final void an(final bdx bdx) {
        this.u += bdx.g;
        this.v += bdx.e;
    }
    
    @Override
    public final void as(final azr azr) {
        final trg y = this.y;
        if (y != null) {
            final ayf ayf = (ayf)y.b;
            if (ayf.t == -1) {
                final aye b = ayf.b();
                b.p = azr.a;
                b.q = azr.b;
                this.y = new trg(b.a(), y.a, (String)y.c);
            }
        }
    }
    
    @Override
    public final void av(final azg azg, final eaa eaa) {
        if (eaa.v() != 0) {
            final int n = 0;
            for (int i = 0; i < eaa.v(); ++i) {
                final int a = ((ayc)eaa.b).a(i);
                final bga w = eaa.w(a);
                if (a == 0) {
                    this.e.f(w);
                }
                else if (a == 11) {
                    this.e.e(w, this.k);
                }
                else {
                    this.e.d(w);
                }
            }
            final long elapsedRealtime = SystemClock.elapsedRealtime();
            if (eaa.x(0)) {
                final bga w2 = eaa.w(0);
                if (this.c != null) {
                    this.ax(w2.b, w2.i);
                }
            }
            Label_0376: {
                if (eaa.x(2) && this.c != null) {
                    final afcr b = azg.r().b;
                    final int size = ((List)b).size();
                    int j = 0;
                Label_0266:
                    while (true) {
                    Label_0368_Outer:
                        while (j < size) {
                            final azp azp = (azp)((List)b).get(j);
                            for (int k = 0; k < azp.a; ++k) {
                                if (azp.c[k]) {
                                    final DrmInitData q = azp.b.a(k).q;
                                    if (q != null) {
                                        break Label_0266;
                                    }
                                }
                            }
                            ++j;
                            continue;
                            DrmInitData q = null;
                            if (q != null) {
                                final PlaybackMetrics$Builder c = this.c;
                                final int a2 = baw.a;
                                int l = 0;
                                while (true) {
                                    while (l < q.c) {
                                        final UUID a3 = q.a(l).a;
                                        int drmType;
                                        if (a3.equals(axy.d)) {
                                            drmType = 3;
                                        }
                                        else if (a3.equals(axy.e)) {
                                            drmType = 2;
                                        }
                                        else {
                                            if (!a3.equals(axy.c)) {
                                                ++l;
                                                continue Label_0368_Outer;
                                            }
                                            drmType = 6;
                                        }
                                        c.setDrmType(drmType);
                                        break Label_0376;
                                    }
                                    int drmType = 1;
                                    continue;
                                }
                            }
                            break Label_0376;
                        }
                        final DrmInitData q = null;
                        continue Label_0266;
                    }
                }
            }
            if (eaa.x(1011)) {
                ++this.w;
            }
            final aza n2 = this.n;
            if (n2 != null) {
                final Context d = this.d;
                final int s = this.s;
                int errorCode = 0;
                int subErrorCode = 0;
                Label_1159: {
                    if (n2.a == 1001) {
                        errorCode = 20;
                        subErrorCode = n;
                    }
                    else {
                        final bee bee = (bee)n2;
                        final boolean b2 = bee.c == 1;
                        final int g = bee.g;
                        final Throwable cause = n2.getCause();
                        dk.d((Object)cause);
                        Label_0988: {
                            Label_0953: {
                                if (cause instanceof IOException) {
                                    if (cause instanceof bcd) {
                                        subErrorCode = ((bcd)cause).d;
                                        errorCode = 5;
                                        break Label_1159;
                                    }
                                    if (!(cause instanceof bcc) && !(cause instanceof ayz)) {
                                        final boolean b3 = cause instanceof bcb;
                                        if (!b3 && !(cause instanceof bco)) {
                                            if (n2.a == 1002) {
                                                errorCode = 21;
                                            }
                                            else if (cause instanceof bkk) {
                                                final Throwable cause2 = cause.getCause();
                                                dk.d((Object)cause2);
                                                final int a4 = baw.a;
                                                if (cause2 instanceof MediaDrm$MediaDrmStateException) {
                                                    subErrorCode = baw.j(((MediaDrm$MediaDrmStateException)cause2).getDiagnosticInfo());
                                                    errorCode = az(subErrorCode);
                                                    break Label_1159;
                                                }
                                                if (cause2 instanceof MediaDrmResetException) {
                                                    errorCode = 27;
                                                }
                                                else if (cause2 instanceof NotProvisionedException) {
                                                    errorCode = 24;
                                                }
                                                else if (cause2 instanceof DeniedByServerException) {
                                                    errorCode = 29;
                                                }
                                                else {
                                                    if (cause2 instanceof blk) {
                                                        break Label_0988;
                                                    }
                                                    if (cause2 instanceof bkf) {
                                                        errorCode = 28;
                                                    }
                                                    else {
                                                        errorCode = 30;
                                                    }
                                                }
                                            }
                                            else {
                                                if (!(cause instanceof bbx) || !(cause.getCause() instanceof FileNotFoundException)) {
                                                    subErrorCode = 0;
                                                    errorCode = 9;
                                                    break Label_1159;
                                                }
                                                final Throwable cause3 = cause.getCause();
                                                dk.d((Object)cause3);
                                                final Throwable cause4 = cause3.getCause();
                                                final int a5 = baw.a;
                                                if (!(cause4 instanceof ErrnoException) || ((ErrnoException)cause4).errno != OsConstants.EACCES) {
                                                    subErrorCode = 0;
                                                    errorCode = 31;
                                                    break Label_1159;
                                                }
                                                errorCode = 32;
                                            }
                                        }
                                        else {
                                            if (aejr.l(d).h() == 1) {
                                                subErrorCode = 0;
                                                errorCode = 3;
                                                break Label_1159;
                                            }
                                            final Throwable cause5 = cause.getCause();
                                            if (cause5 instanceof UnknownHostException) {
                                                subErrorCode = 0;
                                                errorCode = 6;
                                                break Label_1159;
                                            }
                                            if (cause5 instanceof SocketTimeoutException) {
                                                subErrorCode = 0;
                                                errorCode = 7;
                                                break Label_1159;
                                            }
                                            if (b3 && ((bcb)cause).c == 1) {
                                                subErrorCode = 0;
                                                errorCode = 4;
                                                break Label_1159;
                                            }
                                            subErrorCode = 0;
                                            errorCode = 8;
                                            break Label_1159;
                                        }
                                    }
                                    else if (s != 4) {
                                        errorCode = 11;
                                    }
                                    else {
                                        errorCode = 10;
                                    }
                                }
                                else {
                                    if (b2) {
                                        errorCode = 35;
                                        if (g == 0) {
                                            break Label_0953;
                                        }
                                        if (g == 1) {
                                            errorCode = errorCode;
                                            break Label_0953;
                                        }
                                    }
                                    if (b2 && g == 3) {
                                        errorCode = 15;
                                    }
                                    else {
                                        if (b2 && g == 2) {
                                            break Label_0988;
                                        }
                                        if (cause instanceof bma) {
                                            subErrorCode = baw.j(((bma)cause).d);
                                            errorCode = 13;
                                            break Label_1159;
                                        }
                                        final boolean b4 = cause instanceof blw;
                                        errorCode = 14;
                                        if (b4) {
                                            subErrorCode = baw.j(((blw)cause).b);
                                            break Label_1159;
                                        }
                                        if (!(cause instanceof OutOfMemoryError)) {
                                            if (cause instanceof bhf) {
                                                subErrorCode = ((bhf)cause).a;
                                                errorCode = 17;
                                                break Label_1159;
                                            }
                                            if (cause instanceof bhi) {
                                                subErrorCode = ((bhi)cause).a;
                                                errorCode = 18;
                                                break Label_1159;
                                            }
                                            final int a6 = baw.a;
                                            if (cause instanceof MediaCodec$CryptoException) {
                                                subErrorCode = ((MediaCodec$CryptoException)cause).getErrorCode();
                                                errorCode = az(subErrorCode);
                                                break Label_1159;
                                            }
                                            errorCode = 22;
                                        }
                                    }
                                }
                            }
                            subErrorCode = 0;
                            break Label_1159;
                        }
                        subErrorCode = 0;
                        errorCode = 23;
                    }
                }
                this.a.reportPlaybackErrorEvent(new PlaybackErrorEvent$Builder().setTimeSinceCreatedMillis(elapsedRealtime - this.f).setErrorCode(errorCode).setSubErrorCode(subErrorCode).setException((Exception)n2).build());
                this.x = true;
                this.n = null;
            }
            Label_1319: {
                if (eaa.x(2)) {
                    final azq r = azg.r();
                    final boolean a7 = r.a(2);
                    final boolean a8 = r.a(1);
                    boolean a9;
                    final boolean b5 = a9 = r.a(3);
                    if (!a7) {
                        a9 = b5;
                        if (!a8) {
                            if (!b5) {
                                break Label_1319;
                            }
                            a9 = true;
                        }
                    }
                    if (!a7) {
                        this.aC(elapsedRealtime, null, 0);
                    }
                    if (!a8) {
                        this.aA(elapsedRealtime, null, 0);
                    }
                    if (!a9) {
                        this.aB(elapsedRealtime, null, 0);
                    }
                }
            }
            if (this.aE(this.y)) {
                final trg y = this.y;
                final ayf ayf = (ayf)y.b;
                if (ayf.t != -1) {
                    this.aC(elapsedRealtime, ayf, y.a);
                    this.y = null;
                }
            }
            if (this.aE(this.z)) {
                final trg z = this.z;
                this.aA(elapsedRealtime, (ayf)z.b, z.a);
                this.z = null;
            }
            if (this.aE(this.A)) {
                final trg a10 = this.A;
                this.aB(elapsedRealtime, (ayf)a10.b, a10.a);
                this.A = null;
            }
            int n3 = 0;
            switch (aejr.l(this.d).h()) {
                default: {
                    n3 = 1;
                    break;
                }
                case 10: {
                    n3 = 7;
                    break;
                }
                case 9: {
                    n3 = 8;
                    break;
                }
                case 7: {
                    n3 = 3;
                    break;
                }
                case 5: {
                    n3 = 6;
                    break;
                }
                case 4: {
                    n3 = 5;
                    break;
                }
                case 3: {
                    n3 = 4;
                    break;
                }
                case 2: {
                    n3 = 2;
                    break;
                }
                case 1: {
                    n3 = 9;
                    break;
                }
                case 0: {
                    n3 = 0;
                    break;
                }
            }
            if (n3 != this.m) {
                this.m = n3;
                this.a.reportNetworkEvent(new NetworkEvent$Builder().setNetworkType(n3).setTimeSinceCreatedMillis(elapsedRealtime - this.f).build());
            }
            if (azg.k() != 2) {
                this.r = false;
            }
            final bew bew = (bew)azg;
            bew.ad();
            if (bew.G.e == null) {
                this.t = false;
            }
            else if (eaa.x(10)) {
                this.t = true;
            }
            final int m = azg.k();
            int l2;
            if (this.r) {
                l2 = 5;
            }
            else if (this.t) {
                l2 = 13;
            }
            else if (m == 4) {
                l2 = 11;
            }
            else if (m == 2) {
                final int l3 = this.l;
                if (l3 != 0 && l3 != 2) {
                    if (!azg.E()) {
                        l2 = 7;
                    }
                    else if (azg.l() != 0) {
                        l2 = 10;
                    }
                    else {
                        l2 = 6;
                    }
                }
                else {
                    l2 = 2;
                }
            }
            else if (m == 3) {
                if (!azg.E()) {
                    l2 = 4;
                }
                else if (azg.l() != 0) {
                    l2 = 9;
                }
                else {
                    l2 = 3;
                }
            }
            else if (m == 1 && this.l != 0) {
                l2 = 12;
            }
            else {
                l2 = this.l;
            }
            if (this.l != l2) {
                this.l = l2;
                this.x = true;
                this.a.reportPlaybackStateEvent(new PlaybackStateEvent$Builder().setState(this.l).setTimeSinceCreatedMillis(elapsedRealtime - this.f).build());
            }
            if (eaa.x(1028)) {
                this.e.c(eaa.w(1028));
            }
        }
    }
    
    public final void aw() {
        final PlaybackMetrics$Builder c = this.c;
        if (c != null && this.x) {
            c.setAudioUnderrunCount(this.w);
            this.c.setVideoFramesDropped(this.u);
            this.c.setVideoFramesPlayed(this.v);
            final Long n = this.i.get(this.b);
            final PlaybackMetrics$Builder c2 = this.c;
            long longValue;
            if (n == null) {
                longValue = 0L;
            }
            else {
                longValue = n;
            }
            c2.setNetworkTransferDurationMillis(longValue);
            final Long n2 = this.j.get(this.b);
            final PlaybackMetrics$Builder c3 = this.c;
            long longValue2;
            if (n2 == null) {
                longValue2 = 0L;
            }
            else {
                longValue2 = n2;
            }
            c3.setNetworkBytesRead(longValue2);
            final PlaybackMetrics$Builder c4 = this.c;
            int streamSource;
            if (n2 != null && n2 > 0L) {
                streamSource = 1;
            }
            else {
                streamSource = 0;
            }
            c4.setStreamSource(streamSource);
            this.a.reportPlaybackMetrics(this.c.build());
        }
        this.c = null;
        this.b = null;
        this.w = 0;
        this.u = 0;
        this.v = 0;
        this.o = null;
        this.p = null;
        this.q = null;
        this.x = false;
    }
    
    public final void ax(final azl azl, final ayx ayx) {
        final PlaybackMetrics$Builder c = this.c;
        if (ayx == null) {
            return;
        }
        final int a = azl.a(ayx.a);
        if (a == -1) {
            return;
        }
        azl.m(a, this.h);
        azl.o(this.h.c, this.g);
        final ayp b = this.g.c.b;
        final int n = 2;
        int streamType;
        if (b == null) {
            streamType = 0;
        }
        else {
            final int o = baw.o(b.a, b.b);
            if (o != 0) {
                if (o != 1) {
                    if (o != 2) {
                        streamType = 1;
                    }
                    else {
                        streamType = 4;
                    }
                }
                else {
                    streamType = 5;
                }
            }
            else {
                streamType = 3;
            }
        }
        c.setStreamType(streamType);
        final azk g = this.g;
        if (g.n != -9223372036854775807L && !g.l && !g.i && !g.d()) {
            c.setMediaDurationMillis(this.g.b());
        }
        int playbackType = n;
        if (!this.g.d()) {
            playbackType = 1;
        }
        c.setPlaybackType(playbackType);
        this.x = true;
    }
    
    @Override
    public final void ay(final bga bga, final String s) {
        final ayx i = bga.i;
        if ((i == null || !i.a()) && s.equals(this.b)) {
            this.aw();
        }
        this.i.remove(s);
        this.j.remove(s);
    }
    
    @Override
    public final void h(final bga bga, final bns bns) {
        if (bga.i == null) {
            return;
        }
        final ayf c = bns.c;
        dk.d((Object)c);
        final int d = bns.d;
        final bgx e = this.e;
        final azl b = bga.b;
        final ayx i = bga.i;
        dk.d((Object)i);
        final trg y = new trg(c, d, e.g(b, i));
        final int b2 = bns.b;
        if (b2 != 0) {
            if (b2 == 1) {
                this.z = y;
                return;
            }
            if (b2 != 2) {
                if (b2 != 3) {
                    return;
                }
                this.A = y;
                return;
            }
        }
        this.y = y;
    }
    
    @Override
    public final void k(final bga bga, final bnn bnn, final bns bns, final IOException ex, final boolean b) {
        this.s = bns.a;
    }
    
    @Override
    public final void n(final bga bga, final aza n) {
        this.n = n;
    }
    
    @Override
    public final void p(final bga bga, final azf azf, final azf azf2, final int n) {
        int k = n;
        if (n == 1) {
            this.r = true;
            k = 1;
        }
        this.k = k;
    }
}
