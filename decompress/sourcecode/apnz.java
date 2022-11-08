import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class apnz extends agzi implements ahax
{
    public static final apnz a;
    private static volatile ahbe e;
    public apoa b;
    public agyc c;
    public boolean d;
    private int f;
    
    static {
        agzi.registerDefaultInstance((Class)apnz.class, (agzi)(a = new apnz()));
    }
    
    private apnz() {
        this.c = agyc.b;
    }
    
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe e;
                if ((e = apnz.e) == null) {
                    synchronized (apnz.class) {
                        if (apnz.e == null) {
                            apnz.e = (ahbe)new agzb((agzi)apnz.a);
                        }
                    }
                }
                return e;
            }
            case 5: {
                return apnz.a;
            }
            case 4: {
                return new agza((agzi)apnz.a);
            }
            case 3: {
                return new apnz();
            }
            case 2: {
                return newMessageInfo((MessageLite)apnz.a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u100a\u0001\u0003\u1007\u0002", new Object[] { "f", "b", "c", "d" });
            }
            case 1: {
                return null;
            }
            case 0: {
                return 1;
            }
        }
    }
}
