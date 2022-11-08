import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ajbr extends agzi implements ahax
{
    public static final ajbr a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public Object d;
    public aioe e;
    public String f;
    public agyc g;
    private ajsq i;
    private anss j;
    private ahfw k;
    private byte l;
    
    static {
        agzi.registerDefaultInstance(ajbr.class, a = new ajbr());
    }
    
    private ajbr() {
        this.c = 0;
        this.l = 2;
        this.f = "";
        this.g = agyc.b;
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
                if ((h = ajbr.h) == null) {
                    synchronized (ajbr.class) {
                        if (ajbr.h == null) {
                            ajbr.h = (ahbe)new agzb((agzi)ajbr.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return ajbr.a;
            }
            case 4: {
                return new agza((agzi)ajbr.a);
            }
            case 3: {
                return new ajbr();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)ajbr.a, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0000\u0006\u0001\u143c\u0000\u0002\u143c\u0000\u0003\u1409\u0004\u0004\u1409\u0005\u0005\u1409\b\u0006\u100a\t\u0007\u1409\u0006\b\u1008\u0007", new Object[] { "d", "c", "b", akbf.class, aorm.class, "i", "e", "k", "g", "j", "f" });
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
