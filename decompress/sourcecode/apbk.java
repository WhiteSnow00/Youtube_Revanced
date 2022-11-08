import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apbk extends agzi implements ahax
{
    public static final apbk a;
    private static volatile ahbe h;
    public int b;
    public int c;
    public Object d;
    public ajsq e;
    public aioe f;
    public agyc g;
    private ajsq i;
    private ajsq j;
    private ajsq k;
    private ahfw l;
    private byte m;
    
    static {
        agzi.registerDefaultInstance(apbk.class, a = new apbk());
    }
    
    private apbk() {
        this.c = 0;
        this.m = 2;
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
                if ((h = apbk.h) == null) {
                    synchronized (apbk.class) {
                        if (apbk.h == null) {
                            apbk.h = (ahbe)new agzb((agzi)apbk.a);
                        }
                    }
                }
                return h;
            }
            case 5: {
                return apbk.a;
            }
            case 4: {
                return new agza((agzi)apbk.a);
            }
            case 3: {
                return new apbk();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)apbk.a, "\u0001\n\u0001\u0001\u0001\f\n\u0000\u0000\t\u0001\u143c\u0000\u0002\u143c\u0000\u0003\u1409\u0003\u0004\u1409\b\u0005\u100a\t\u0006\u1409\n\u0007\u1409\u0004\t\u1409\u0005\n\u143c\u0000\f\u1409\u0006", new Object[] { "d", "c", "b", aorm.class, akbf.class, "e", "f", "g", "l", "i", "j", apcv.class, "k" });
            }
            case 1: {
                if (o == null) {
                    b = false;
                }
                this.m = (byte)(b ? 1 : 0);
                return null;
            }
            case 0: {
                return this.m;
            }
        }
    }
}
