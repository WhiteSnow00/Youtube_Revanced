import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aknz extends agzi implements ahax
{
    public static final aknz a;
    private static volatile ahbe h;
    public int b;
    public akjd c;
    public int d;
    public String e;
    public boolean f;
    public int g;
    private byte i;
    
    static {
        agzi.registerDefaultInstance(aknz.class, a = new aknz());
    }
    
    private aknz() {
        this.i = 2;
        this.e = "";
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
                if ((h = aknz.h) == null) {
                    synchronized (aknz.class) {
                        if (aknz.h == null) {
                            aknz.h = (ahbe)new agzb((agzi)aknz.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return aknz.a;
            }
            case 4: {
                return new agza((agzi)aknz.a);
            }
            case 3: {
                return new aknz();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aknz.a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0001\u0001\u1409\u0000\u0002\u100b\u0001\u0003\u1008\u0002\u0005\u1007\u0003\u0006\u100c\u0004", new Object[] { "b", "c", "d", "e", "f", "g", apjd.e });
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
