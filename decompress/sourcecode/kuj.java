import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kuj extends agzi implements ahax
{
    public static final kuj a;
    private static volatile ahbe f;
    public int b;
    public agzq c;
    public ameo d;
    public String e;
    private byte g;
    
    static {
        agzi.registerDefaultInstance((Class)kuj.class, (agzi)(a = new kuj()));
    }
    
    private kuj() {
        this.g = 2;
        this.c = emptyIntList();
        this.e = "";
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
                if ((f = kuj.f) == null) {
                    synchronized (kuj.class) {
                        if (kuj.f == null) {
                            kuj.f = (ahbe)new agzb((agzi)kuj.a);
                        }
                    }
                }
                return f;
            }
            case 5: {
                return kuj.a;
            }
            case 4: {
                return new agza((agzi)kuj.a);
            }
            case 3: {
                return new kuj();
            }
            case 2: {
                return newMessageInfo((MessageLite)kuj.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0001\u0001\u0016\u0002\u1409\u0000\u0003\u1008\u0001", new Object[] { "b", "c", "d", "e" });
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
