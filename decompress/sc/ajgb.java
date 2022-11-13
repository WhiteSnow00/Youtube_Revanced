import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajgb extends ahbh implements ahcw
{
    public static final ajgb a;
    private static volatile ahdd o;
    public int b;
    public int c;
    public Object d;
    public int e;
    public Object f;
    public int g;
    public String h;
    public String i;
    public String j;
    public CommandOuterClass$Command k;
    public ahbx l;
    public boolean m;
    public String n;
    private CommandOuterClass$Command p;
    private byte q;
    
    static {
        ahbh.registerDefaultInstance((Class)ajgb.class, (ahbh)(a = new ajgb()));
    }
    
    private ajgb() {
        this.c = 0;
        this.e = 0;
        this.q = 2;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = emptyProtobufList();
        this.n = "";
    }
    
    protected final Object dynamicMethod(final ahbg ahbg, final Object o, final Object o2) {
        final ahbg a = ahbg.a;
        final int ordinal = ahbg.ordinal();
        byte q = 1;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahdd o3;
                if ((o3 = ajgb.o) == null) {
                    synchronized (ajgb.class) {
                        if (ajgb.o == null) {
                            ajgb.o = (ahdd)new ahba((ahbh)ajgb.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajgb.a;
            }
            case 4: {
                return new ahaz((boolean[])null, (float[])null);
            }
            case 3: {
                return new ajgb();
            }
            case 2: {
                return newMessageInfo((MessageLite)ajgb.a, "\u0001\r\u0002\u0001\u0001\r\r\u0000\u0001\u0002\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1409\u0004\u0006\u103b\u0000\u0007\u103b\u0000\b\u103d\u0001\t\u1037\u0001\n\u001b\u000b\u1007\n\f\u1008\u000b\r\u1409\u0005", new Object[] { "d", "c", "f", "e", "b", "g", ajek.g, "h", "i", "j", "k", "l", ajfu.class, "m", "n", "p" });
            }
            case 1: {
                if (o == null) {
                    q = 0;
                }
                this.q = q;
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
