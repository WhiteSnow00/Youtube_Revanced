import com.google.protobuf.MessageLite;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajdx extends agzi implements ahax
{
    public static final ajdx a;
    private static volatile ahbe o;
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
    public agzy l;
    public boolean m;
    public String n;
    private CommandOuterClass$Command p;
    private byte q;
    
    static {
        agzi.registerDefaultInstance(ajdx.class, a = new ajdx());
    }
    
    private ajdx() {
        this.c = 0;
        this.e = 0;
        this.q = 2;
        this.h = "";
        this.i = "";
        this.j = "";
        this.l = agzi.emptyProtobufList();
        this.n = "";
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe o3;
                if ((o3 = ajdx.o) == null) {
                    synchronized (ajdx.class) {
                        if (ajdx.o == null) {
                            ajdx.o = (ahbe)new agzb((agzi)ajdx.a);
                        }
                    }
                }
                return o3;
            }
            case 5: {
                return ajdx.a;
            }
            case 4: {
                return new agza((float[])null, (float[][])null);
            }
            case 3: {
                return new ajdx();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajdx.a, "\u0001\r\u0002\u0001\u0001\r\r\u0000\u0001\u0002\u0001\u100c\u0000\u0002\u1008\u0001\u0003\u1008\u0002\u0004\u1008\u0003\u0005\u1409\u0004\u0006\u103b\u0000\u0007\u103b\u0000\b\u103d\u0001\t\u1037\u0001\n\u001b\u000b\u1007\n\f\u1008\u000b\r\u1409\u0005", new Object[] { "d", "c", "f", "e", "b", "g", ajcg.g, "h", "i", "j", "k", "l", ajdq.class, "m", "n", "p" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.q = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.q;
            }
        }
    }
}
