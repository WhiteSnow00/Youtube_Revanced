import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aieo extends agzi implements ahax
{
    public static final aieo a;
    private static volatile ahbe k;
    public int b;
    public ajsq c;
    public String d;
    public boolean e;
    public ajsq f;
    public String g;
    public boolean h;
    public agzy i;
    public ajsq j;
    private byte l;
    
    static {
        agzi.registerDefaultInstance((Class)aieo.class, (agzi)(a = new aieo()));
    }
    
    private aieo() {
        this.l = 2;
        this.d = "";
        this.e = true;
        this.g = "";
        this.h = true;
        this.i = emptyProtobufList();
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        final int ordinal = agzh.ordinal();
        boolean b = true;
        switch (ordinal) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe k;
                if ((k = aieo.k) == null) {
                    synchronized (aieo.class) {
                        if (aieo.k == null) {
                            aieo.k = (ahbe)new agzb((agzi)aieo.a);
                        }
                    }
                }
                return k;
            }
            case 5: {
                return aieo.a;
            }
            case 4: {
                return new agza((agzi)aieo.a);
            }
            case 3: {
                return new aieo();
            }
            case 2: {
                return newMessageInfo((MessageLite)aieo.a, "\u0001\b\u0000\u0001\u0002\u000b\b\u0000\u0001\u0004\u0002\u1409\u0001\u0003\u1008\u0002\u0004\u1007\u0003\u0006\u1409\u0005\u0007\u1008\u0006\b\u1007\u0007\n\u041b\u000b\u1409\t", new Object[] { "b", "c", "d", "e", "f", "g", "h", "i", ajsq.class, "j" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.l = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.l;
            }
        }
    }
}
