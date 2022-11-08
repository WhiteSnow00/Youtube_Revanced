import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atww extends agzd implements agze
{
    public static final atww a;
    private static volatile ahbe h;
    public int b;
    public atwv c;
    public atxn d;
    public int e;
    public atwu f;
    public String g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(atww.class, (agzi)(a = new atww()));
    }
    
    private atww() {
        this.i = 2;
        this.g = "";
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
                final ahbe h;
                if ((h = atww.h) == null) {
                    synchronized (atww.class) {
                        if (atww.h == null) {
                            atww.h = (ahbe)new agzb((agzi)atww.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return atww.a;
            }
            case 4: {
                return new agzc((agzd)atww.a);
            }
            case 3: {
                return new atww();
            }
            case 2: {
                return newMessageInfo((MessageLite)atww.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u100c\u0002\u0004\u1009\u0003\u0005\u1008\u0004", new Object[] { "b", "c", "d", "e", arbt.g, "f", "g" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.i = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.i;
            }
        }
    }
}
