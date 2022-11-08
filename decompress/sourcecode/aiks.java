import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aiks extends agzi implements ahax
{
    public static final aiks a;
    private static volatile ahbe h;
    public int b;
    public String c;
    public boolean d;
    public aikx e;
    public boolean f;
    public aikt g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aiks.class, a = new aiks());
    }
    
    private aiks() {
        this.i = 2;
        this.c = "";
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
                final ahbe h;
                if ((h = aiks.h) == null) {
                    synchronized (aiks.class) {
                        if (aiks.h == null) {
                            aiks.h = (ahbe)new agzb((agzi)aiks.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aiks.a;
            }
            case 4: {
                return new agza((agzi)aiks.a);
            }
            case 3: {
                return new aiks();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aiks.a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001\u1008\u0000\u0002\u1007\u0001\u0003\u1009\u0002\u0004\u1007\u0003\u0005\u1409\u0004", new Object[] { "b", "c", "d", "e", "f", "g" });
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
