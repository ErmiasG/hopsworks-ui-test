# hopsworks-ui-test

## run test
HOPSWORKS_URL=https://localhost:8181/ HEADLESS=false BROWSER=firefox mvn -Dtest=**/*IT.java test-compile surefire:test
