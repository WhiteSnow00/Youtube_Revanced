import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahmt extends agzi implements ahax
{
    public static final ahmt a;
    private static volatile ahbe f;
    public int b;
    public anss c;
    public String d;
    public int e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)ahmt.class, (agzi)(a = new ahmt()));
    }
    
    private ahmt() {
        this.g = 2;
        this.d = "";
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
                final ahbe f;
                if ((f = ahmt.f) == null) {
                    synchronized (ahmt.class) {
                        if (ahmt.f == null) {
                            ahmt.f = (ahbe)new agzb((agzi)ahmt.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return ahmt.a;
            }
            case 4: {
                return new agza((agzi)ahmt.a);
            }
            case 3: {
                return new ahmt();
            }
            case 2: {
                return newMessageInfo((MessageLite)ahmt.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u100c\u0002", new Object[] { "b", "c", "d", "e", albn.e });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.g = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.g;
            }
        }
    }
}