// 
// Decompiled by Procyon v0.6.0
// 

abstract class aazf implements tcc
{
    public aazf() {
    }
    
    public final /* bridge */ void sd(final Object o, final Exception ex) {
        final String value = String.valueOf(o);
        final StringBuilder sb = new StringBuilder("Couldn't retrieve annotation image from [uri=");
        sb.append(value);
        sb.append("]");
        ttr.l(sb.toString());
    }
}
