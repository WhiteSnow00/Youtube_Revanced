import com.google.protobuf.MessageLite;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aijf extends agzi implements ahax
{
    public static final aijf a;
    private static volatile ahbe b;
    private ahas c;
    
    static {
        agzi.registerDefaultInstance(aijf.class, a = new aijf());
    }
    
    private aijf() {
        this.c = ahas.a;
    }
    
    @Override
    protected final Object dynamicMethod(final agzh agzh, final Object o, final Object o2) {
        final agzh a = agzh.a;
        switch (agzh.ordinal()) {
            default: {
                throw new UnsupportedOperationException();
            }
            case 6: {
                final ahbe b;
                if ((b = aijf.b) == null) {
                    synchronized (aijf.class) {
                        if (aijf.b == null) {
                            aijf.b = (ahbe)new agzb((agzi)aijf.a);
                        }
                    }
                }
                return b;
            }
            case 5: {
                return aijf.a;
            }
            case 4: {
                return new agza((agzi)aijf.a);
            }
            case 3: {
                return new aijf();
            }
            case 2: {
                return agzi.newMessageInfo((MessageLite)aijf.a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[] { "c", aije.a });
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
