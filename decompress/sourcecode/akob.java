import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class akob extends agzi implements ahax
{
    public static final akob a;
    private static volatile ahbe f;
    public int b;
    public akjd c;
    public String d;
    public agyc e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance(akob.class, a = new akob());
    }
    
    private akob() {
        this.g = 2;
        this.d = "";
        this.e = agyc.b;
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
                final ahbe f;
                if ((f = akob.f) == null) {
                    synchronized (akob.class) {
                        if (akob.f == null) {
                            akob.f = (ahbe)new agzb((agzi)akob.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return akob.a;
            }
            case 4: {
                return new agza((agzi)akob.a);
            }
            case 3: {
                return new akob();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)akob.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u1008\u0001\u0003\u100a\u0002", new Object[] { "b", "c", "d", "e" });
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
