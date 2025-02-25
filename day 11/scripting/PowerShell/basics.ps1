Write-host "Hello World:"

 $age = Read-Host "Enter your age"
 if($age -ge 18){
    Write-Host "You are an adult."
 }else{
    Write-Host "You are a minor."
 }