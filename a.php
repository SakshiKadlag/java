<?php
$str=$_GET['str'];
$r=$_GET['menu'];


switch($r)
{
case "length":    Length($str);        break;
case "reverse":  Reverse();            break;
case "count":      Mycount();       break;
case "changecase": changecase();  break; 
}

function Length($str)
{

    for($i=0; $str[$i]!=NULL;$i++);
     echo --$i;
}

function Reverse()
{
$cnt=0;
for($i=0;$str[$i]!=null;$i++)
{
     $cnt++;

}
echo $cnt;
}

function Mycount()
{
echo " Count";
}

function changecase ()
{
echo "Length";
}

?>
